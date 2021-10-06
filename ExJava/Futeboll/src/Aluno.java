import POO.Pessoa;

public class Aluno extends Pessoa {

        protected String corCabelo;
        protected String corOlhos;
       
       
        @Override
        public void correr() {
            System.out.println("Pessoa correndo");
            
        }
        @Override
        public void alimentar() {
           System.out.println("Pessoa se alimentando");
            
        }
        @Override
        public void andar() {
           System.out.println("Pessoa andando");
            
        }


        public String getCorCabelo() {
            return corCabelo;
        }

        public void setCorCabelo(String corCabelo) {
            this.corCabelo = corCabelo;
        }

        public String getCorOlhos() {
            return corOlhos;
        }

        public void setCorOlhos(String corOlhos) {
            this.corOlhos = corOlhos;
        }
        
}
