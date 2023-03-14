package gr.aueb.cf.ch18.mobilecontacts.model;

public abstract class AbstractEntity implements IdentifiableEntity{

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
