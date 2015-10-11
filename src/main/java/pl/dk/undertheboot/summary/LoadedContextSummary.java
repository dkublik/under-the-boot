package pl.dk.undertheboot.summary;

import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@OptimisticLocking(type = OptimisticLockType.VERSION)
class LoadedContextSummary {

    @Id
    @SequenceGenerator(name = "s_summary", sequenceName = "s_summary")
    @GeneratedValue(strategy = SEQUENCE, generator = "s_summary")
    private long id;

    @Version
    private Long version;

    private Integer beansLoaded;

    public LoadedContextSummary() {
    }

    public LoadedContextSummary(Integer beansLoaded) {
        this.beansLoaded = beansLoaded;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getBeansLoaded() {
        return beansLoaded;
    }

    public void setBeansLoaded(Integer beansLoaded) {
        this.beansLoaded = beansLoaded;
    }
}
