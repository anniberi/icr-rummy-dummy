# Rummy Dummy

An Android app for tracking scores in Rummy (Remi), designed to replace pen-and-paper bookkeeping with a fast, error-resistant interface. Built for a Human-Computer Interaction course, the project follows a user-centered design process: HTA task analysis, a high-fidelity Moqups prototype, small-scale user testing and an evaluation against software-quality criteria. A Kotlin/Android implementation accompanies the design work.

> **Note:** Apart from this summary, everything in this project is written in Bosnian: the rest of this README, the source code, the comments and the technical documentation.

> **Napomena:** Izvorni kod, komentari i tehnička dokumentacija za ovaj projekat su napisani na bosanskom jeziku.

## O projektu

Projekat je rađen u okviru predmeta **Interakcija čovjek – računar** na Elektrotehničkom fakultetu Univerziteta u Sarajevu (akademska 2024/2025. godina).

Rummy Dummy pomaže igračima Remija da prate i bilježe bodove tokom partije. Aplikacija smanjuje ljudske greške pri računanju bodova, ubrzava igru i daje pregled pravila, trenutnog stanja i historije partija. Ciljni korisnici su mlađi i srednje iskusni korisnici pametnih telefona, koji aplikaciju koriste u opuštenom okruženju (kod kuće, u kafiću ili u igraonicama društvenih igara).

## Metodologija

Rad se zasniva na pristupu **dizajna usmjerenog na korisnika** (engl. *User-Centered Design*):

- **Istraživanje korisnika i definisanje zahtjeva:** unos igrača, unos bodova, pregled trenutnih bodova, historija partija i pravila igre.
- **HTA dijagram** (hijerarhijska analiza zadataka): identifikacija ključnih koraka pri praćenju bodova.
- **High-fidelity interaktivni prototip:** izrađen u alatu Moqups (ekrani Home Menu, Create a game, Round Edit, Round Menu, Game Rules, Current Stats, Game History, Exit Screen).
- **Testiranje s korisnicima:** testiranje manjeg obima s tri korisnika i iterativno unapređivanje interfejsa.
- **Principi dizajna interakcije:** vidljivost, logičnost, konzistentnost, povratne informacije i „mudra ograničenja", na primjer partija mora imati najmanje 2, a najviše 5 igrača.
- **Projektni uzorci:** jasna polazna mjesta, konzistentan vizuelni okvir, dijagonalni balans, ilustrovani izbori (unos bodova klikom na karte), mreža jednakih elemenata, naglašeno dugme za izlaz i drugi.
- **Evaluacija:** ocjena prema atributima kvaliteta softvera (razumljivost, mogućnost učenja, operativnost, atraktivnost).

## Struktura repozitorija

```
.
├── ICR_Izvjestaj_Aksamovic_Sandina_Biberovic_Berina.pdf   # Izvještaj: dizajn, prototip, evaluacija i ekrani aplikacije
└── RummyDummy/                                            # Android Studio projekat (Kotlin)
    ├── app/src/main/java/com/example/test2/               # Aktivnosti i adapteri
    ├── app/src/main/res/                                  # Rasporedi ekrana (layouts), boje, teme, ikonice
    ├── gradle/                                            # Gradle wrapper i katalog verzija
    └── build.gradle.kts, settings.gradle.kts
```

Izvorni kod u direktoriju `RummyDummy/` sadrži sljedeće ekrane:

| Aktivnost | Opis |
|---|---|
| `MainActivity` | Početni meni s dugmadima za kreiranje igre, historiju, pravila i izlaz |
| `CreateAGameActivity` | Unos imena igrača u listu (`RecyclerView`) i početak partije |
| `GameRules` | Ekran s pravilima igre |
| `GameHistory` | Ekran za pregled historije partija |

Kompletan dizajn svih ekrana (uključujući unos bodova i pregled trenutnog stanja) prikazan je u izvještaju.

## Pokretanje

**Preduslovi:** Android Studio (preporučena novija verzija s podrškom za AGP 8.6), JDK 17 i Android SDK 34.

1. Otvoriti direktorij `RummyDummy/` u Android Studiju (*File → Open*).
2. Sačekati da Gradle sinhronizuje projekat. Wrapper automatski preuzima Gradle 8.7.
3. Pokrenuti aplikaciju na emulatoru ili fizičkom uređaju s Androidom 7.0 (API 24) ili novijim.

Projekat se može prevesti i iz komandne linije:

```bash
cd RummyDummy
./gradlew assembleDebug
```

## Tehnologije

- Kotlin, Android SDK (minSdk 24, targetSdk 34)
- AndroidX AppCompat, RecyclerView, ConstraintLayout, Material komponente
- Gradle (Kotlin DSL) s katalogom verzija (`libs.versions.toml`)

## Autori

- **Studenti:** Sandina Akšamović, Berina Biberović
- **Predmetni profesor:** prof. dr Dušanka Bošković
- **Ustanova:** Elektrotehnički fakultet, Univerzitet u Sarajevu, Odsjek za automatiku i elektroniku
