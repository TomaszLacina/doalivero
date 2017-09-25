package pl.lacina.doalivero.resource;

public class PlayerResource {

    private String id;
    private String name;
    private Boolean active;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getActive() {
        return active;
    }

    public static class PlayerBuilder {
        private PlayerResource resource = new PlayerResource();


        public PlayerBuilder withName(String name){
            resource.name = name;
            return this;
        }

        public PlayerBuilder withActive(Boolean active){
            resource.active = active;
            return this;
        }

        public PlayerBuilder withId(String id){
            resource.id = id;
            return this;
        }

        public PlayerResource build(){
            return resource;
        }
    }

}
