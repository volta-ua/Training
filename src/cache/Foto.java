package cache;

import java.util.Objects;

class Foto{
    private Object foto;

    Foto(String uri){
        foto=loadByUri(uri);
    }

    @Override
    public String toString() {
        return foto.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foto foto1 = (Foto) o;
        return Objects.equals(foto, foto1.foto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foto);
    }

    private String loadByUri(String uri){
        return uri+"_DONE";
    }

}