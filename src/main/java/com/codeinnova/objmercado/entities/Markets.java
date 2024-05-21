package com.codeinnova.objmercado.entities;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name="Markets Popayán")
public class Markets {
    //    Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean establishment; //establecimiento
    private boolean onlyCash; //método de pago en efectivo
    private Location location; // ubicación
    private OperatingHours operatingHours;
    private Products products;
    private Qualification qualification;
    private Contact contact;

    //Clases internas para definir los atributos
    @Embeddable
    public static class Location { //Creo esta clase para poder incorporar los 3 atributos de location
        private Long latitude;
        private Long longitude;
        private String adress;

        // Constructor de localizacion

        public Location(Long latitude, Long longitude, String adress) {
            this.latitude = latitude;
            this.longitude = longitude;
            this.adress = adress;
        }
        public Location() {

        }
        //Getter and Setter de Localización
        public Long getLatitude() {
            return latitude;
        }
        public void setLatitude(Long latitude) {
            this.latitude = latitude;
        }
        public Long getLongitude() {
            return longitude;
        }
        public void setLongitude(Long longitude) {
            this.longitude = longitude;
        }
        public String getAdress() {
            return adress;
        }
        public void setAdress(String adress) {
            this.adress = adress;
        }
        // ToString Location
        @Override
        public String toString() {
            return "Location{" +
                    "latitude=" + latitude +
                    ", longitude=" + longitude +
                    ", adress='" + adress + '\'' +
                    '}';
        }
    }

    @Embeddable
    public static class OperatingHours {
        private LocalTime openingmonday;
        private LocalTime closingmonday;
        private LocalTime openingtuesday;
        private LocalTime closingtuesday;
        private LocalTime openingwednesday;
        private LocalTime closingwednesday;
        private LocalTime openingthursday;
        private LocalTime closingthursday;
        private LocalTime openingfriday;
        private LocalTime closingfriday;
        private LocalTime openingsaturday;
        private LocalTime closingsaturday;
        private LocalTime openingsunday;
        private LocalTime closingsunday;

        public OperatingHours(LocalTime openingmonday, LocalTime closingmonday, LocalTime openingtuesday, LocalTime closingtuesday, LocalTime openingwednesday, LocalTime closingwednesday, LocalTime openingthursday, LocalTime closingthursday, LocalTime openingfriday, LocalTime closingfriday, LocalTime openingsaturday, LocalTime closingsaturday, LocalTime openingsunday, LocalTime closingsunday) {
            this.openingmonday = openingmonday;
            this.closingmonday = closingmonday;
            this.openingtuesday = openingtuesday;
            this.closingtuesday = closingtuesday;
            this.openingwednesday = openingwednesday;
            this.closingwednesday = closingwednesday;
            this.openingthursday = openingthursday;
            this.closingthursday = closingthursday;
            this.openingfriday = openingfriday;
            this.closingfriday = closingfriday;
            this.openingsaturday = openingsaturday;
            this.closingsaturday = closingsaturday;
            this.openingsunday = openingsunday;
            this.closingsunday = closingsunday;
        }

        public OperatingHours() {
        }
        public LocalTime getOpeningmonday() {
            return openingmonday;
        }
        public void setOpeningmonday(LocalTime openingmonday) {
            this.openingmonday = openingmonday;
        }

        public LocalTime getClosingmonday() {
            return closingmonday;
        }

        public void setClosingmonday(LocalTime closingmonday) {
            this.closingmonday = closingmonday;
        }

        public LocalTime getOpeningtuesday() {
            return openingtuesday;
        }

        public void setOpeningtuesday(LocalTime openingtuesday) {
            this.openingtuesday = openingtuesday;
        }

        public LocalTime getClosingtuesday() {
            return closingtuesday;
        }

        public void setClosingtuesday(LocalTime closingtuesday) {
            this.closingtuesday = closingtuesday;
        }

        public LocalTime getOpeningwednesday() {
            return openingwednesday;
        }

        public void setOpeningwednesday(LocalTime openingwednesday) {
            this.openingwednesday = openingwednesday;
        }

        public LocalTime getClosingwednesday() {
            return closingwednesday;
        }

        public void setClosingwednesday(LocalTime closingwednesday) {
            this.closingwednesday = closingwednesday;
        }

        public LocalTime getOpeningthursday() {
            return openingthursday;
        }

        public void setOpeningthursday(LocalTime openingthursday) {
            this.openingthursday = openingthursday;
        }

        public LocalTime getClosingthursday() {
            return closingthursday;
        }

        public void setClosingthursday(LocalTime closingthursday) {
            this.closingthursday = closingthursday;
        }

        public LocalTime getOpeningfriday() {
            return openingfriday;
        }

        public void setOpeningfriday(LocalTime openingfriday) {
            this.openingfriday = openingfriday;
        }

        public LocalTime getClosingfriday() {
            return closingfriday;
        }

        public void setClosingfriday(LocalTime closingfriday) {
            this.closingfriday = closingfriday;
        }

        public LocalTime getOpeningsaturday() {
            return openingsaturday;
        }

        public void setOpeningsaturday(LocalTime openingsaturday) {
            this.openingsaturday = openingsaturday;
        }

        public LocalTime getClosingsaturday() {
            return closingsaturday;
        }

        public void setClosingsaturday(LocalTime closingsaturday) {
            this.closingsaturday = closingsaturday;
        }

        public LocalTime getOpeningsunday() {
            return openingsunday;
        }

        public void setOpeningsunday(LocalTime openingsunday) {
            this.openingsunday = openingsunday;
        }

        public LocalTime getClosingsunday() {
            return closingsunday;
        }

        public void setClosingsunday(LocalTime closingsunday) {
            this.closingsunday = closingsunday;
        }
    }

    @Embeddable
    public static class Products {
        // Frutas
            public boolean manzanas; // Apples
            public boolean bananos; // Bananas
            public boolean naranjas; // Oranges
            public boolean uvas; // Grapes
            public boolean fresas; // Strawberries
            public boolean sandias; // Watermelons
            public boolean mangos; // Mangos
            public boolean pinas; // Pineapples
            public boolean limones; // Lemons
            public boolean peras; // Pears
            public boolean melocotones; // Peaches
            public boolean kiwis; // Kiwis
            public boolean melones; // Melons
            public boolean cerezas; // Cherries
            public boolean papayas; // Papayas
            public boolean mora; // Blackberry
            public boolean uchuvas;
            public boolean maracuya;
            public boolean mandarina;
            public boolean coco;

            // Verduras
            public boolean tomates; // Tomatoes
            public boolean zanahorias; // Carrots
            public boolean cebollas; // Onions
            public boolean cebolleta;
            public boolean lechugas; // Lettuces
            public boolean pepinos; // Cucumbers
            public boolean pimientos; // Bell peppers
            public boolean espinacas; // Spinach
            public boolean brocoli; // Broccoli
            public boolean papas; // Potatoes
            public boolean platanos; // Plantains
            public boolean champinones; // Mushrooms
            public boolean apio; // Celery
            public boolean ajo; // Garlic
            public boolean maiz; // Corn
            public boolean repollo;
            public boolean zucchini;
            public boolean zapallo;
            public boolean remolacha;
            public boolean rabano;
            public boolean aguacate;
            public boolean acelga;
            public boolean puerro;
            public boolean coliflor;
            public boolean habichuela;

            // Carnes
            public boolean res; // Beef
            public boolean cerdo; // Pork
            public boolean pollo; // Chicken
            public boolean pescado; // Fish
            public boolean ternera; // Veal
            public boolean cordero; // Lamb
            public boolean conejo; // Rabbit
            public boolean pavo; // Turkey
            public boolean jamon; // Ham
            public boolean salchichas; // Sausages
            public boolean chorizo; // Chorizo
            public boolean longaniza; // Longaniza sausage
            public boolean butifarra; // Butifarra sausage
            public boolean morcilla; // Blood sausage
            public boolean bufalo; // Buffalo

            // Lácteos
            public boolean leche; // Milk
            public boolean queso; // Cheese
            public boolean yogur; // Yogurt
            public boolean mantequilla; // Butter
            public boolean cremaDeLeche; // Cream
            public boolean lecheCondensada; // Condensed milk
            public boolean helado; // Ice cream
            public boolean cuajada; // Curd
            public boolean sueroDeLeche; // Buttermilk

            // Panadería y Pastelería
            public boolean panTajado; // Sliced bread

            // Otros
            public boolean arroz; // Rice
            public boolean pasta; // Pasta
            public boolean garbanzos; // Chickpeas
            public boolean frijoles; // Beans
            public boolean arveja;
            public boolean lentejas; // Lentils
            public boolean nueces; // Walnuts
            public boolean almendras; // Almonds
            public boolean perejil; // Parsley
            public boolean cilantro; // Coriander
            public boolean albahaca; // Basil
            public boolean pimienta; // Pepper
            public boolean cimarron; // Oregano
            public boolean tomillo; // Thyme
            public boolean laurel; // Bay leaf
            public boolean canela; // Cinnamon

            // Aceites
            public boolean aceiteOliva; // Olive oil
            public boolean aceiteGirasol; // Sunflower oil
            public boolean aceiteCoco; // Coconut oil

            // Vinagres
            public boolean vinagreBalsamico; // Balsamic vinegar
            public boolean vinagreVino; // Wine vinegar
            public boolean vinagreManzana; // Apple cider vinegar

            // Enlatados
            public boolean atunEnlatado; // Canned tuna
            public boolean sardinasEnlatadas; // Canned sardines

            // Condimentos
            public boolean mostaza; // Mustard
            public boolean ketchup; // Ketchup
            public boolean mayonesa; // Mayonnaise

            // Vinagretas
            public boolean vinagretas; // Vinaigrettes

            // Harinas
            public boolean harinas; // Flours

            // Azúcar y Sal
            public boolean azucar; // Sugar
            public boolean sal; // Salt

            // Otros
            public boolean pulpaFruta;

            public Products(){

            }

        public Products(boolean manzanas, boolean bananos, boolean naranjas, boolean uvas, boolean fresas, boolean sandias, boolean mangos, boolean pinas, boolean limones, boolean peras, boolean melocotones, boolean kiwis, boolean melones, boolean cerezas, boolean papayas, boolean mora, boolean uchuvas, boolean maracuya, boolean mandarina, boolean coco, boolean tomates, boolean zanahorias, boolean cebollas, boolean cebolleta, boolean lechugas, boolean pepinos, boolean pimientos, boolean espinacas, boolean brocoli, boolean papas, boolean platanos, boolean champinones, boolean apio, boolean ajo, boolean maiz, boolean repollo, boolean zucchini, boolean zapallo, boolean remolacha, boolean rabano, boolean aguacate, boolean acelga, boolean puerro, boolean coliflor, boolean habichuela, boolean res, boolean cerdo, boolean pollo, boolean pescado, boolean ternera, boolean cordero, boolean conejo, boolean pavo, boolean jamon, boolean salchichas, boolean chorizo, boolean longaniza, boolean butifarra, boolean morcilla, boolean bufalo, boolean leche, boolean queso, boolean yogur, boolean mantequilla, boolean cremaDeLeche, boolean lecheCondensada, boolean helado, boolean cuajada, boolean sueroDeLeche, boolean panTajado, boolean arroz, boolean pasta, boolean garbanzos, boolean frijoles, boolean arveja, boolean lentejas, boolean nueces, boolean almendras, boolean perejil, boolean cilantro, boolean albahaca, boolean pimienta, boolean cimarron, boolean tomillo, boolean laurel, boolean canela, boolean aceiteOliva, boolean aceiteGirasol, boolean aceiteCoco, boolean vinagreBalsamico, boolean vinagreVino, boolean vinagreManzana, boolean atunEnlatado, boolean sardinasEnlatadas, boolean mostaza, boolean ketchup, boolean mayonesa, boolean vinagretas, boolean harinas, boolean azucar, boolean sal, boolean pulpaFruta) {
            this.manzanas = manzanas;
            this.bananos = bananos;
            this.naranjas = naranjas;
            this.uvas = uvas;
            this.fresas = fresas;
            this.sandias = sandias;
            this.mangos = mangos;
            this.pinas = pinas;
            this.limones = limones;
            this.peras = peras;
            this.melocotones = melocotones;
            this.kiwis = kiwis;
            this.melones = melones;
            this.cerezas = cerezas;
            this.papayas = papayas;
            this.mora = mora;
            this.uchuvas = uchuvas;
            this.maracuya = maracuya;
            this.mandarina = mandarina;
            this.coco = coco;
            this.tomates = tomates;
            this.zanahorias = zanahorias;
            this.cebollas = cebollas;
            this.cebolleta = cebolleta;
            this.lechugas = lechugas;
            this.pepinos = pepinos;
            this.pimientos = pimientos;
            this.espinacas = espinacas;
            this.brocoli = brocoli;
            this.papas = papas;
            this.platanos = platanos;
            this.champinones = champinones;
            this.apio = apio;
            this.ajo = ajo;
            this.maiz = maiz;
            this.repollo = repollo;
            this.zucchini = zucchini;
            this.zapallo = zapallo;
            this.remolacha = remolacha;
            this.rabano = rabano;
            this.aguacate = aguacate;
            this.acelga = acelga;
            this.puerro = puerro;
            this.coliflor = coliflor;
            this.habichuela = habichuela;
            this.res = res;
            this.cerdo = cerdo;
            this.pollo = pollo;
            this.pescado = pescado;
            this.ternera = ternera;
            this.cordero = cordero;
            this.conejo = conejo;
            this.pavo = pavo;
            this.jamon = jamon;
            this.salchichas = salchichas;
            this.chorizo = chorizo;
            this.longaniza = longaniza;
            this.butifarra = butifarra;
            this.morcilla = morcilla;
            this.bufalo = bufalo;
            this.leche = leche;
            this.queso = queso;
            this.yogur = yogur;
            this.mantequilla = mantequilla;
            this.cremaDeLeche = cremaDeLeche;
            this.lecheCondensada = lecheCondensada;
            this.helado = helado;
            this.cuajada = cuajada;
            this.sueroDeLeche = sueroDeLeche;
            this.panTajado = panTajado;
            this.arroz = arroz;
            this.pasta = pasta;
            this.garbanzos = garbanzos;
            this.frijoles = frijoles;
            this.arveja = arveja;
            this.lentejas = lentejas;
            this.nueces = nueces;
            this.almendras = almendras;
            this.perejil = perejil;
            this.cilantro = cilantro;
            this.albahaca = albahaca;
            this.pimienta = pimienta;
            this.cimarron = cimarron;
            this.tomillo = tomillo;
            this.laurel = laurel;
            this.canela = canela;
            this.aceiteOliva = aceiteOliva;
            this.aceiteGirasol = aceiteGirasol;
            this.aceiteCoco = aceiteCoco;
            this.vinagreBalsamico = vinagreBalsamico;
            this.vinagreVino = vinagreVino;
            this.vinagreManzana = vinagreManzana;
            this.atunEnlatado = atunEnlatado;
            this.sardinasEnlatadas = sardinasEnlatadas;
            this.mostaza = mostaza;
            this.ketchup = ketchup;
            this.mayonesa = mayonesa;
            this.vinagretas = vinagretas;
            this.harinas = harinas;
            this.azucar = azucar;
            this.sal = sal;
            this.pulpaFruta = pulpaFruta;
        }

        public boolean isManzanas() {
            return manzanas;
        }

        public void setManzanas(boolean manzanas) {
            this.manzanas = manzanas;
        }

        public boolean isBananos() {
            return bananos;
        }

        public void setBananos(boolean bananos) {
            this.bananos = bananos;
        }

        public boolean isNaranjas() {
            return naranjas;
        }

        public void setNaranjas(boolean naranjas) {
            this.naranjas = naranjas;
        }

        public boolean isUvas() {
            return uvas;
        }

        public void setUvas(boolean uvas) {
            this.uvas = uvas;
        }

        public boolean isFresas() {
            return fresas;
        }

        public void setFresas(boolean fresas) {
            this.fresas = fresas;
        }

        public boolean isSandias() {
            return sandias;
        }

        public void setSandias(boolean sandias) {
            this.sandias = sandias;
        }

        public boolean isMangos() {
            return mangos;
        }

        public void setMangos(boolean mangos) {
            this.mangos = mangos;
        }

        public boolean isPinas() {
            return pinas;
        }

        public void setPinas(boolean pinas) {
            this.pinas = pinas;
        }

        public boolean isLimones() {
            return limones;
        }

        public void setLimones(boolean limones) {
            this.limones = limones;
        }

        public boolean isPeras() {
            return peras;
        }

        public void setPeras(boolean peras) {
            this.peras = peras;
        }

        public boolean isMelocotones() {
            return melocotones;
        }

        public void setMelocotones(boolean melocotones) {
            this.melocotones = melocotones;
        }

        public boolean isKiwis() {
            return kiwis;
        }

        public void setKiwis(boolean kiwis) {
            this.kiwis = kiwis;
        }

        public boolean isMelones() {
            return melones;
        }

        public void setMelones(boolean melones) {
            this.melones = melones;
        }

        public boolean isCerezas() {
            return cerezas;
        }

        public void setCerezas(boolean cerezas) {
            this.cerezas = cerezas;
        }

        public boolean isPapayas() {
            return papayas;
        }

        public void setPapayas(boolean papayas) {
            this.papayas = papayas;
        }

        public boolean isMora() {
            return mora;
        }

        public void setMora(boolean mora) {
            this.mora = mora;
        }

        public boolean isUchuvas() {
            return uchuvas;
        }

        public void setUchuvas(boolean uchuvas) {
            this.uchuvas = uchuvas;
        }

        public boolean isMaracuya() {
            return maracuya;
        }

        public void setMaracuya(boolean maracuya) {
            this.maracuya = maracuya;
        }

        public boolean isMandarina() {
            return mandarina;
        }

        public void setMandarina(boolean mandarina) {
            this.mandarina = mandarina;
        }

        public boolean isCoco() {
            return coco;
        }

        public void setCoco(boolean coco) {
            this.coco = coco;
        }

        public boolean isTomates() {
            return tomates;
        }

        public void setTomates(boolean tomates) {
            this.tomates = tomates;
        }

        public boolean isZanahorias() {
            return zanahorias;
        }

        public void setZanahorias(boolean zanahorias) {
            this.zanahorias = zanahorias;
        }

        public boolean isCebollas() {
            return cebollas;
        }

        public void setCebollas(boolean cebollas) {
            this.cebollas = cebollas;
        }

        public boolean isCebolleta() {
            return cebolleta;
        }

        public void setCebolleta(boolean cebolleta) {
            this.cebolleta = cebolleta;
        }

        public boolean isLechugas() {
            return lechugas;
        }

        public void setLechugas(boolean lechugas) {
            this.lechugas = lechugas;
        }

        public boolean isPepinos() {
            return pepinos;
        }

        public void setPepinos(boolean pepinos) {
            this.pepinos = pepinos;
        }

        public boolean isPimientos() {
            return pimientos;
        }

        public void setPimientos(boolean pimientos) {
            this.pimientos = pimientos;
        }

        public boolean isEspinacas() {
            return espinacas;
        }

        public void setEspinacas(boolean espinacas) {
            this.espinacas = espinacas;
        }

        public boolean isBrocoli() {
            return brocoli;
        }

        public void setBrocoli(boolean brocoli) {
            this.brocoli = brocoli;
        }

        public boolean isPapas() {
            return papas;
        }

        public void setPapas(boolean papas) {
            this.papas = papas;
        }

        public boolean isPlatanos() {
            return platanos;
        }

        public void setPlatanos(boolean platanos) {
            this.platanos = platanos;
        }

        public boolean isChampinones() {
            return champinones;
        }

        public void setChampinones(boolean champinones) {
            this.champinones = champinones;
        }

        public boolean isApio() {
            return apio;
        }

        public void setApio(boolean apio) {
            this.apio = apio;
        }

        public boolean isAjo() {
            return ajo;
        }

        public void setAjo(boolean ajo) {
            this.ajo = ajo;
        }

        public boolean isMaiz() {
            return maiz;
        }

        public void setMaiz(boolean maiz) {
            this.maiz = maiz;
        }

        public boolean isRepollo() {
            return repollo;
        }

        public void setRepollo(boolean repollo) {
            this.repollo = repollo;
        }

        public boolean isZucchini() {
            return zucchini;
        }

        public void setZucchini(boolean zucchini) {
            this.zucchini = zucchini;
        }

        public boolean isZapallo() {
            return zapallo;
        }

        public void setZapallo(boolean zapallo) {
            this.zapallo = zapallo;
        }

        public boolean isRemolacha() {
            return remolacha;
        }

        public void setRemolacha(boolean remolacha) {
            this.remolacha = remolacha;
        }

        public boolean isRabano() {
            return rabano;
        }

        public void setRabano(boolean rabano) {
            this.rabano = rabano;
        }

        public boolean isAguacate() {
            return aguacate;
        }

        public void setAguacate(boolean aguacate) {
            this.aguacate = aguacate;
        }

        public boolean isAcelga() {
            return acelga;
        }

        public void setAcelga(boolean acelga) {
            this.acelga = acelga;
        }

        public boolean isPuerro() {
            return puerro;
        }

        public void setPuerro(boolean puerro) {
            this.puerro = puerro;
        }

        public boolean isColiflor() {
            return coliflor;
        }

        public void setColiflor(boolean coliflor) {
            this.coliflor = coliflor;
        }

        public boolean isHabichuela() {
            return habichuela;
        }

        public void setHabichuela(boolean habichuela) {
            this.habichuela = habichuela;
        }

        public boolean isRes() {
            return res;
        }

        public void setRes(boolean res) {
            this.res = res;
        }

        public boolean isCerdo() {
            return cerdo;
        }

        public void setCerdo(boolean cerdo) {
            this.cerdo = cerdo;
        }

        public boolean isPollo() {
            return pollo;
        }

        public void setPollo(boolean pollo) {
            this.pollo = pollo;
        }

        public boolean isPescado() {
            return pescado;
        }

        public void setPescado(boolean pescado) {
            this.pescado = pescado;
        }

        public boolean isTernera() {
            return ternera;
        }

        public void setTernera(boolean ternera) {
            this.ternera = ternera;
        }

        public boolean isCordero() {
            return cordero;
        }

        public void setCordero(boolean cordero) {
            this.cordero = cordero;
        }

        public boolean isConejo() {
            return conejo;
        }

        public void setConejo(boolean conejo) {
            this.conejo = conejo;
        }

        public boolean isPavo() {
            return pavo;
        }

        public void setPavo(boolean pavo) {
            this.pavo = pavo;
        }

        public boolean isJamon() {
            return jamon;
        }

        public void setJamon(boolean jamon) {
            this.jamon = jamon;
        }

        public boolean isSalchichas() {
            return salchichas;
        }

        public void setSalchichas(boolean salchichas) {
            this.salchichas = salchichas;
        }

        public boolean isChorizo() {
            return chorizo;
        }

        public void setChorizo(boolean chorizo) {
            this.chorizo = chorizo;
        }

        public boolean isLonganiza() {
            return longaniza;
        }

        public void setLonganiza(boolean longaniza) {
            this.longaniza = longaniza;
        }

        public boolean isButifarra() {
            return butifarra;
        }

        public void setButifarra(boolean butifarra) {
            this.butifarra = butifarra;
        }

        public boolean isMorcilla() {
            return morcilla;
        }

        public void setMorcilla(boolean morcilla) {
            this.morcilla = morcilla;
        }

        public boolean isBufalo() {
            return bufalo;
        }

        public void setBufalo(boolean bufalo) {
            this.bufalo = bufalo;
        }

        public boolean isLeche() {
            return leche;
        }

        public void setLeche(boolean leche) {
            this.leche = leche;
        }

        public boolean isQueso() {
            return queso;
        }

        public void setQueso(boolean queso) {
            this.queso = queso;
        }

        public boolean isYogur() {
            return yogur;
        }

        public void setYogur(boolean yogur) {
            this.yogur = yogur;
        }

        public boolean isMantequilla() {
            return mantequilla;
        }

        public void setMantequilla(boolean mantequilla) {
            this.mantequilla = mantequilla;
        }

        public boolean isCremaDeLeche() {
            return cremaDeLeche;
        }

        public void setCremaDeLeche(boolean cremaDeLeche) {
            this.cremaDeLeche = cremaDeLeche;
        }

        public boolean isLecheCondensada() {
            return lecheCondensada;
        }

        public void setLecheCondensada(boolean lecheCondensada) {
            this.lecheCondensada = lecheCondensada;
        }

        public boolean isHelado() {
            return helado;
        }

        public void setHelado(boolean helado) {
            this.helado = helado;
        }

        public boolean isCuajada() {
            return cuajada;
        }

        public void setCuajada(boolean cuajada) {
            this.cuajada = cuajada;
        }

        public boolean isSueroDeLeche() {
            return sueroDeLeche;
        }

        public void setSueroDeLeche(boolean sueroDeLeche) {
            this.sueroDeLeche = sueroDeLeche;
        }

        public boolean isPanTajado() {
            return panTajado;
        }

        public void setPanTajado(boolean panTajado) {
            this.panTajado = panTajado;
        }

        public boolean isArroz() {
            return arroz;
        }

        public void setArroz(boolean arroz) {
            this.arroz = arroz;
        }

        public boolean isPasta() {
            return pasta;
        }

        public void setPasta(boolean pasta) {
            this.pasta = pasta;
        }

        public boolean isGarbanzos() {
            return garbanzos;
        }

        public void setGarbanzos(boolean garbanzos) {
            this.garbanzos = garbanzos;
        }

        public boolean isFrijoles() {
            return frijoles;
        }

        public void setFrijoles(boolean frijoles) {
            this.frijoles = frijoles;
        }

        public boolean isArveja() {
            return arveja;
        }

        public void setArveja(boolean arveja) {
            this.arveja = arveja;
        }

        public boolean isLentejas() {
            return lentejas;
        }

        public void setLentejas(boolean lentejas) {
            this.lentejas = lentejas;
        }

        public boolean isNueces() {
            return nueces;
        }

        public void setNueces(boolean nueces) {
            this.nueces = nueces;
        }

        public boolean isAlmendras() {
            return almendras;
        }

        public void setAlmendras(boolean almendras) {
            this.almendras = almendras;
        }

        public boolean isPerejil() {
            return perejil;
        }

        public void setPerejil(boolean perejil) {
            this.perejil = perejil;
        }

        public boolean isCilantro() {
            return cilantro;
        }

        public void setCilantro(boolean cilantro) {
            this.cilantro = cilantro;
        }

        public boolean isAlbahaca() {
            return albahaca;
        }

        public void setAlbahaca(boolean albahaca) {
            this.albahaca = albahaca;
        }

        public boolean isPimienta() {
            return pimienta;
        }

        public void setPimienta(boolean pimienta) {
            this.pimienta = pimienta;
        }

        public boolean isCimarron() {
            return cimarron;
        }

        public void setCimarron(boolean cimarron) {
            this.cimarron = cimarron;
        }

        public boolean isTomillo() {
            return tomillo;
        }

        public void setTomillo(boolean tomillo) {
            this.tomillo = tomillo;
        }

        public boolean isLaurel() {
            return laurel;
        }

        public void setLaurel(boolean laurel) {
            this.laurel = laurel;
        }

        public boolean isCanela() {
            return canela;
        }

        public void setCanela(boolean canela) {
            this.canela = canela;
        }

        public boolean isAceiteOliva() {
            return aceiteOliva;
        }

        public void setAceiteOliva(boolean aceiteOliva) {
            this.aceiteOliva = aceiteOliva;
        }

        public boolean isAceiteGirasol() {
            return aceiteGirasol;
        }

        public void setAceiteGirasol(boolean aceiteGirasol) {
            this.aceiteGirasol = aceiteGirasol;
        }

        public boolean isAceiteCoco() {
            return aceiteCoco;
        }

        public void setAceiteCoco(boolean aceiteCoco) {
            this.aceiteCoco = aceiteCoco;
        }

        public boolean isVinagreBalsamico() {
            return vinagreBalsamico;
        }

        public void setVinagreBalsamico(boolean vinagreBalsamico) {
            this.vinagreBalsamico = vinagreBalsamico;
        }

        public boolean isVinagreVino() {
            return vinagreVino;
        }

        public void setVinagreVino(boolean vinagreVino) {
            this.vinagreVino = vinagreVino;
        }

        public boolean isVinagreManzana() {
            return vinagreManzana;
        }

        public void setVinagreManzana(boolean vinagreManzana) {
            this.vinagreManzana = vinagreManzana;
        }

        public boolean isAtunEnlatado() {
            return atunEnlatado;
        }

        public void setAtunEnlatado(boolean atunEnlatado) {
            this.atunEnlatado = atunEnlatado;
        }

        public boolean isSardinasEnlatadas() {
            return sardinasEnlatadas;
        }

        public void setSardinasEnlatadas(boolean sardinasEnlatadas) {
            this.sardinasEnlatadas = sardinasEnlatadas;
        }

        public boolean isMostaza() {
            return mostaza;
        }

        public void setMostaza(boolean mostaza) {
            this.mostaza = mostaza;
        }

        public boolean isKetchup() {
            return ketchup;
        }

        public void setKetchup(boolean ketchup) {
            this.ketchup = ketchup;
        }

        public boolean isMayonesa() {
            return mayonesa;
        }

        public void setMayonesa(boolean mayonesa) {
            this.mayonesa = mayonesa;
        }

        public boolean isVinagretas() {
            return vinagretas;
        }

        public void setVinagretas(boolean vinagretas) {
            this.vinagretas = vinagretas;
        }

        public boolean isHarinas() {
            return harinas;
        }

        public void setHarinas(boolean harinas) {
            this.harinas = harinas;
        }

        public boolean isAzucar() {
            return azucar;
        }

        public void setAzucar(boolean azucar) {
            this.azucar = azucar;
        }

        public boolean isSal() {
            return sal;
        }

        public void setSal(boolean sal) {
            this.sal = sal;
        }

        public boolean isPulpaFruta() {
            return pulpaFruta;
        }

        public void setPulpaFruta(boolean pulpaFruta) {
            this.pulpaFruta = pulpaFruta;
        }

        @Override
        public String toString() {
            return "Products{" +
                    "manzanas=" + manzanas +
                    ", bananos=" + bananos +
                    ", naranjas=" + naranjas +
                    ", uvas=" + uvas +
                    ", fresas=" + fresas +
                    ", sandias=" + sandias +
                    ", mangos=" + mangos +
                    ", pinas=" + pinas +
                    ", limones=" + limones +
                    ", peras=" + peras +
                    ", melocotones=" + melocotones +
                    ", kiwis=" + kiwis +
                    ", melones=" + melones +
                    ", cerezas=" + cerezas +
                    ", papayas=" + papayas +
                    ", mora=" + mora +
                    ", uchuvas=" + uchuvas +
                    ", maracuya=" + maracuya +
                    ", mandarina=" + mandarina +
                    ", coco=" + coco +
                    ", tomates=" + tomates +
                    ", zanahorias=" + zanahorias +
                    ", cebollas=" + cebollas +
                    ", cebolleta=" + cebolleta +
                    ", lechugas=" + lechugas +
                    ", pepinos=" + pepinos +
                    ", pimientos=" + pimientos +
                    ", espinacas=" + espinacas +
                    ", brocoli=" + brocoli +
                    ", papas=" + papas +
                    ", platanos=" + platanos +
                    ", champinones=" + champinones +
                    ", apio=" + apio +
                    ", ajo=" + ajo +
                    ", maiz=" + maiz +
                    ", repollo=" + repollo +
                    ", zucchini=" + zucchini +
                    ", zapallo=" + zapallo +
                    ", remolacha=" + remolacha +
                    ", rabano=" + rabano +
                    ", aguacate=" + aguacate +
                    ", acelga=" + acelga +
                    ", puerro=" + puerro +
                    ", coliflor=" + coliflor +
                    ", habichuela=" + habichuela +
                    ", res=" + res +
                    ", cerdo=" + cerdo +
                    ", pollo=" + pollo +
                    ", pescado=" + pescado +
                    ", ternera=" + ternera +
                    ", cordero=" + cordero +
                    ", conejo=" + conejo +
                    ", pavo=" + pavo +
                    ", jamon=" + jamon +
                    ", salchichas=" + salchichas +
                    ", chorizo=" + chorizo +
                    ", longaniza=" + longaniza +
                    ", butifarra=" + butifarra +
                    ", morcilla=" + morcilla +
                    ", bufalo=" + bufalo +
                    ", leche=" + leche +
                    ", queso=" + queso +
                    ", yogur=" + yogur +
                    ", mantequilla=" + mantequilla +
                    ", cremaDeLeche=" + cremaDeLeche +
                    ", lecheCondensada=" + lecheCondensada +
                    ", helado=" + helado +
                    ", cuajada=" + cuajada +
                    ", sueroDeLeche=" + sueroDeLeche +
                    ", panTajado=" + panTajado +
                    ", arroz=" + arroz +
                    ", pasta=" + pasta +
                    ", garbanzos=" + garbanzos +
                    ", frijoles=" + frijoles +
                    ", arveja=" + arveja +
                    ", lentejas=" + lentejas +
                    ", nueces=" + nueces +
                    ", almendras=" + almendras +
                    ", perejil=" + perejil +
                    ", cilantro=" + cilantro +
                    ", albahaca=" + albahaca +
                    ", pimienta=" + pimienta +
                    ", cimarron=" + cimarron +
                    ", tomillo=" + tomillo +
                    ", laurel=" + laurel +
                    ", canela=" + canela +
                    ", aceiteOliva=" + aceiteOliva +
                    ", aceiteGirasol=" + aceiteGirasol +
                    ", aceiteCoco=" + aceiteCoco +
                    ", vinagreBalsamico=" + vinagreBalsamico +
                    ", vinagreVino=" + vinagreVino +
                    ", vinagreManzana=" + vinagreManzana +
                    ", atunEnlatado=" + atunEnlatado +
                    ", sardinasEnlatadas=" + sardinasEnlatadas +
                    ", mostaza=" + mostaza +
                    ", ketchup=" + ketchup +
                    ", mayonesa=" + mayonesa +
                    ", vinagretas=" + vinagretas +
                    ", harinas=" + harinas +
                    ", azucar=" + azucar +
                    ", sal=" + sal +
                    ", pulpaFruta=" + pulpaFruta +
                    '}';
        }
    }

    @Embeddable
    public static class Qualification {
        private float score;
        private String comment;
        //Constructor Qualification
        public Qualification(){

        }
        public Qualification(float score, String comment) {
            this.score = score;
            this.comment = comment;
        }
        //Getter y Setter Qualification
        public float getScore() {
            return score;
        }
        public void setScore(float score) {
            this.score = score;
        }
        public String getComment() {
            return comment;
        }
        public void setComment(String comment) {
            this.comment = comment;
        }
        //ToString Qualification
        @Override
        public String toString() {
            return "Qualification{" +
                    "score=" + score +
                    ", comment='" + comment + '\'' +
                    '}';
        }
    }

    @Embeddable
    public static class Contact {
        private String email;
        private Long phone;
        // Constructor contact
        public Contact(){

        }
        public Contact(String email, Long phone) {
            this.email = email;
            this.phone = phone;
        }
        // Getter y Setter contact
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public Long getPhone() {
            return phone;
        }
        public void setPhone(Long phone) {
            this.phone = phone;
        }
        //ToString contact
       @Override
        public String toString() {
            return "Contact{" +
                    "email='" + email + '\'' +
                    ", phone=" + phone +
                    '}';
        }
    }


    //Constructor

    public Markets() {
    }

    public Markets(Long id, String name, boolean establishment, boolean onlyCash, Location location, OperatingHours operatingHours, Products products, Qualification qualification, Contact contact) {
        this.id = id;
        this.name = name;
        this.establishment = establishment;
        this.onlyCash = onlyCash;
        this.location = location;
        this.operatingHours = operatingHours;
        this.products = products;
        this.qualification = qualification;
        this.contact = contact;
    }

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEstablishment() {
        return establishment;
    }

    public void setEstablishment(boolean establishment) {
        this.establishment = establishment;
    }

    public boolean isOnlyCash() {
        return onlyCash;
    }

    public void setOnlyCash(boolean onlyCash) {
        this.onlyCash = onlyCash;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public OperatingHours getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(OperatingHours operatingHours) {
        this.operatingHours = operatingHours;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


    //To String


    @Override
    public String toString() {
        return "Markets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", establishment=" + establishment +
                ", onlyCash=" + onlyCash +
                ", location=" + location +
                ", operatingHours=" + operatingHours +
                ", products=" + products +
                ", qualification=" + qualification +
                ", contact=" + contact +
                '}';
    }
}








