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
-------------------------------
create table personne of TPERSONNE;
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
