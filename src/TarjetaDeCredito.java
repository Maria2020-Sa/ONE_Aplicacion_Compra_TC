import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {

        private double limiteTarjeta;
        private double saldoTarjeta;
        private List<Compra> listaDeCompras;

        public TarjetaDeCredito(double limiteTarjeta) {
                this.limiteTarjeta = limiteTarjeta;
                this.saldoTarjeta = limiteTarjeta;
                this.listaDeCompras = new ArrayList<>();
        }

        public boolean lanzarCompra(Compra compra){
                if(this.saldoTarjeta > compra.getValor()){
                        this.saldoTarjeta -= compra.getValor();
                        this.listaDeCompras.add(compra);
                        return true;
                }
                return false;
        }

        public double getLimiteTarjeta() {
                return limiteTarjeta;
        }

        public double getSaldoTarjeta() {
                return saldoTarjeta;
        }

        public List<Compra> getListaDeCompras() {
                return listaDeCompras;
        }
}