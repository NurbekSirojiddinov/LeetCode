package Alorithm_Univercity.paradigm.amaliy_6_Q_N;

public class Ishchilar extends Xodimlar {
        private String staji;
        private String millati;
        private String manzili;

        public Ishchilar() {
        }


        public Ishchilar(String staji, String millati, String manzili) {
            this.staji = staji;
            this.millati = millati;
            this.manzili = manzili;
        }

        public Ishchilar(String FIO, Integer yoshi, String jinsi, String staji, String millati, String manzili) {
            super(FIO, yoshi, jinsi);
            this.staji = staji;
            this.millati = millati;
            this.manzili = manzili;
        }

        public String getStaji() {
            return staji;
        }

        public void setStaji(String staji) {
            this.staji = staji;
        }

        public String getMillati() {
            return millati;
        }

        public void setMillati(String millati) {
            this.millati = millati;
        }

        public String getManzili() {
            return manzili;
        }

        public void setManzili(String manzili) {
            this.manzili = manzili;
        }

        @Override
        public String toString() {
            return "Ishchilar{" +
                    " manzili='" + getFIO() + '\'' +
                    ", staji='" + staji + '\'' +
                    ", millati='" + millati + '\'' +
                    ", manzili='" + manzili + '\'' +
                    ", manzili='" + getYoshi() + '\'' +
                    ", manzili='" + getJinsi() + '\'' +
                    '}';
        }
    }

