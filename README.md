# Virtuell Biluthyrning ✨
##### Målet med uppgiften var att  designa och utveckla en konsolbaserad applikation för att hantera en biluthyrningstjänst. Användare ska kunna hyra olika typer avfordon, returnera dem och se kostnader associerade med varje uthyrning.
Projektet utförds med Java i IntelliJIdea.

 ## Struktur

1.  Fordonsklasser:
Car,Convertible,Suv,Truck och Vehicle och implementerande specifika attribut och metoder för varje klass.

2. Interfaces:
 ett interface Rentable med metoder för att hyra ut och returnera
fordon, samt beräkna hyreskostnaden.

3. Användarinteraktion:
Ett användargränssnitt där användare kan välja ett fordon, hyra det, returnera det och få en sammanställning av kostnaden.

Projktet använder DTO som står för Data Transfer Object, vilket är ett designmönster. Programmet använder service, model, repository. Service är en Java-klass som tinnehåller Business Logic, inkapsling av applikationsfunktionalitet.



## Att strarta programmet
När projektet oppnas, i projektverktygsfönstret  leta upp källan | main | java | Main. java-filen och öppna den i editorn/ IntelliJIdea. I redigeraren klickar du på rännstensikonen för att köra programmet och väljer Kör 'Main'. main()'.



## Hur man skickar en GET-begäran i JavaScript med hjälp av Axios
För att skicka en GET-begäran med hjälp av Axios så behöver du bara skicka in webbadressen till metoden get(), som returnerar ett
löfte. Svaret som returneras från löftet kan nås med hjälp av metoden then().
Låt oss se ett exempel:
 axios.get("http://localhost:8080/getAllNote")
            .then((response) => {
                const notes = response.data
                setNotes(notes)
            })

            
