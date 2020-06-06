CREATE OR REPLACE TYPE TPERSONNE AS OBJECT (noPersonne number(5),nom varchar2(20),prenom varchar2(20),tel varchar2(20),mail varchar2(20),STATIC PROCEDURE afficherFicheSignaletique) NOT FINAL ;
/
CREATE TYPE TENSEIGNANT UNDER TPERSONNE(datePriseFonction date,indice number(5)); 
/
create type tab_TENSEIGNANT as table of TENSEIGNANT;
/
create type TDEPARTEMENT as object(codeDepartement number(5),nom varchar(100),enseignants tab_TENSEIGNANT);
/
create type tab_TDEPARTEMENT as table of TDEPARTEMENT;
/
create type TCOLLEGE as object(codeCollege number(5),nom varchar(100),adresseSite varchar(100),departements tab_TDEPARTEMENT);
/
create or replace TYPE T_SALLE as object(No_salle number(5),nom varchar(20),capacite number(20));
/
CREATE or replace TYPE T_COURS as object(No_cours number(5), libelle_cours varchar(20),enseignants tab_TENSEIGNANT,refSalle REF T_SALLE);
/
CREATE TYPE T_ETUDIANT UNDER TPERSONNE(AnneeEntree date,indice_etd number(5),STATIC FUNCTION CalculerMoyenne RETURN NUMBER,STATIC PROCEDURE afficherMatSansNote);
/
create type note as object(ref_ETUDIANT REF T_ETUDIANT,ref_COURS REF T_COURS,note_controle varchar(20));
/
create table notes of note;
-------------------------------
create table personne of TPERSONNE;
/
----------------------------------
CREATE OR REPLACE TYPE BODY TPERSONNE AS
STATIC PROCEDURE afficherFicheSignaletique IS
CURSOR cpersonnes IS SELECT * FROM personne;
m TPERSONNE;
    BEGIN
        FOR m IN cpersonnes LOOP
            DBMS_OUTPUT.PUT_LINE(m.noPersonne || ' - ' || m.nom || ' - ' ||m.prenom || ' - ' || m.tel || ' - ' || m.mail);
        END LOOP;
    END;
END;
/
---------------------------------------------------------
CREATE OR REPLACE TYPE BODY T_ETUDIANT AS
STATIC FUNCTION CalculerMoyenne RETURN NUMBER
IS
n INTEGER;
    BEGIN
        SELECT AVG(note_controle) INTO n FROM notes where ref_ETUDIANT = self;
        RETURN n;
    END; 
STATIC PROCEDURE afficherMatSansNote IS
CURSOR cnote_etudiant IS SELECT ref_COURS FROM notes where ref_ETUDIANT = self and note_controle is null;
n note;
    BEGIN
        FOR n IN cnote_etudiant LOOP
            DBMS_OUTPUT.PUT_LINE(n.ref_COURS.libelle_cours);
        END LOOP;
    END;    
END;
/

