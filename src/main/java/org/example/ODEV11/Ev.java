package org.example.ODEV11;

public class Ev {

    private String il;
    private String ilce;
    private String mahalle;

    private int binaYili;
    private int balkonSayisi;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;

    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;
    private boolean hasKlima;
    private boolean hasHavuz;


    public static final class EvBuilder {
        private String il;
        private String ilce;
        private String mahalle;
        private int binaYili;
        private int balkonSayisi;
        private int odaSayisi;
        private int banyoSayisi;
        private int tuvaletSayisi;
        private boolean isDublex;
        private boolean isEsyali;
        private boolean hasOtopark;
        private boolean hasCocukParki;
        private boolean hasKlima;
        private boolean hasHavuz;

        private EvBuilder() {
        }

        public static EvBuilder anEv() {
            return new EvBuilder();
        }

        public EvBuilder withIl(String il) {
            this.il = il;
            return this;
        }

        public EvBuilder withIlce(String ilce) {
            this.ilce = ilce;
            return this;
        }

        public EvBuilder withMahalle(String mahalle) {
            this.mahalle = mahalle;
            return this;
        }

        public EvBuilder withBinaYili(int binaYili) {
            this.binaYili = binaYili;
            return this;
        }

        public EvBuilder withBalkonSayisi(int balkonSayisi) {
            this.balkonSayisi = balkonSayisi;
            return this;
        }

        public EvBuilder withOdaSayisi(int odaSayisi) {
            this.odaSayisi = odaSayisi;
            return this;
        }

        public EvBuilder withBanyoSayisi(int banyoSayisi) {
            this.banyoSayisi = banyoSayisi;
            return this;
        }

        public EvBuilder withTuvaletSayisi(int tuvaletSayisi) {
            this.tuvaletSayisi = tuvaletSayisi;
            return this;
        }

        public EvBuilder withIsDublex(boolean isDublex) {
            this.isDublex = isDublex;
            return this;
        }

        public EvBuilder withIsEsyali(boolean isEsyali) {
            this.isEsyali = isEsyali;
            return this;
        }

        public EvBuilder withHasOtopark(boolean hasOtopark) {
            this.hasOtopark = hasOtopark;
            return this;
        }

        public EvBuilder withHasCocukParki(boolean hasCocukParki) {
            this.hasCocukParki = hasCocukParki;
            return this;
        }

        public EvBuilder withHasKlima(boolean hasKlima) {
            this.hasKlima = hasKlima;
            return this;
        }

        public EvBuilder withHasHavuz(boolean hasHavuz) {
            this.hasHavuz = hasHavuz;
            return this;
        }

        public Ev build() {
            Ev ev = new Ev();
            ev.ilce = this.ilce;
            ev.tuvaletSayisi = this.tuvaletSayisi;
            ev.il = this.il;
            ev.hasCocukParki = this.hasCocukParki;
            ev.balkonSayisi = this.balkonSayisi;
            ev.isDublex = this.isDublex;
            ev.banyoSayisi = this.banyoSayisi;
            ev.hasOtopark = this.hasOtopark;
            ev.hasKlima = this.hasKlima;
            ev.odaSayisi = this.odaSayisi;
            ev.hasHavuz = this.hasHavuz;
            ev.mahalle = this.mahalle;
            ev.isEsyali = this.isEsyali;
            ev.binaYili = this.binaYili;
            return ev;
        }
    }

    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", binaYili=" + binaYili +
                ", balkonSayisi=" + balkonSayisi +
                ", odaSayisi=" + odaSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", isDublex=" + isDublex +
                ", isEsyali=" + isEsyali +
                ", hasOtopark=" + hasOtopark +
                ", hasCocukParki=" + hasCocukParki +
                ", hasKlima=" + hasKlima +
                ", hasHavuz=" + hasHavuz +
                '}';
    }
}






