

interface API {
    String obtenerDatos();
}

class ApiGitHub implements API {
    @Override
    public String obtenerDatos(){
        return "Repositorios de usuario: repo1, repo2, repo3";
    }
}

class ApiClima implements API {
    @Override
    public String obtenerDatos(){
        return "Temperatura actual: 22°C";
    }
}

class ClienteAPI {
    private API api;

    public ClienteAPI(API api){
        this.api = api;
    }

    public void setAPI(API api){
        this.api = api;
    }

    public void mostrarDatos(){
        System.out.println("Los datos obtenidos son: "+ api.obtenerDatos());
    }

    // public void mostrarDatos(){
    //     if(api==null){
    //         System.out.println("API no definida.");
    //     } else {
    //         System.out.println("Los datos obtenidos son: "+ api.obtenerDatos());
    //     }
    //
    // }

}



public class MainAndresMateo {

    public static void main(String[] args) {
        ClienteAPI miEjemplo = new ClienteAPI(new ApiGitHub());
        miEjemplo.mostrarDatos();

        miEjemplo.setAPI(new ApiClima());
        miEjemplo.mostrarDatos();
        
    }
}
