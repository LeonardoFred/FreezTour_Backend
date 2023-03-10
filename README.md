## Table of Contents 
- [Big picture](#Big-picture)
- [Punti extra](#Punti-extra)

## Big picture
Si vuole progettare una applicazione per gestire prenotazione dei voli per la compagnia aerea EconomicAir Company.

In particolare:

## Prevedere un catalogo dei voli con i seguenti dati:

- Aeroporto di partenza
- Aeroporto di arrivo
- Data e ora di partenza
- Data e ora di arrivo

Ogni aeroporto è una entità di cui vogliamo memorizzare:

## Nome Aeroporto ("Aeroporto Internazionale Leonardo da Vinci)
- Città (Es "Fiumicino")
- Nazione (Es "Italia")
- Codice aeroporto (FCO)

Ogni prenotazione ha i seguenti dati:

- Un codice alfanumerico di 6 caratteri (es "AZ7868)
- Il codice del posto di bordo (es "A45")
- Una descrizione (es "Posto finestrino)
- Costo del biglietto

Dopo aver analizzato il testo:

Crea un nuovo progetto Spring chiamato EconomicAir ed imposta le dipendenze Spring necessarie

Crea le entità che modellano il dominio applicativo

Crea i layer MVC necessari per le CRUD di base e maschere front end (maschere opzionali)

Imposta il logging su file e console (opzionale)

Realizza per ogni entità i servizi REST associati e le Collection su Postman per i test

Predisponi una batteria base di test JUnit (opzionale)

Predisponi una serie di dati di test per l'inizializzazione del database sfruttando i metodi offerti dai repository.

## Punti extra
Nella procedura di import iniziale prevedere l'inserimento degli aeroporti da un elenco csv fornito. (opzionale)
