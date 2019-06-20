package me.vukas.hiperfjavapersistence.service;

import static org.assertj.core.api.Assertions.assertThat;

import me.vukas.hiperfjavapersistence.entity.inheritance.jointable.Child1Jt;
import me.vukas.hiperfjavapersistence.entity.inheritance.jointable.Child2Jt;
import me.vukas.hiperfjavapersistence.entity.inheritance.jointable.ParentJt;
import me.vukas.hiperfjavapersistence.entity.inheritance.mappedsuperclass.Child1Ms;
import me.vukas.hiperfjavapersistence.entity.inheritance.mappedsuperclass.Child2Ms;
import me.vukas.hiperfjavapersistence.entity.inheritance.singletable.Child1St;
import me.vukas.hiperfjavapersistence.entity.inheritance.singletable.Child2St;
import me.vukas.hiperfjavapersistence.entity.inheritance.singletable.ParentSt;
import me.vukas.hiperfjavapersistence.entity.inheritance.tableperclass.Child1TPC;
import me.vukas.hiperfjavapersistence.entity.inheritance.tableperclass.Child2TPC;
import me.vukas.hiperfjavapersistence.entity.inheritance.tableperclass.ParentTPC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InheritanceIT {

  @Autowired
  private InheritanceService service;

  @Test
  public void singleTableInheritance(){

    ParentSt parent = new ParentSt();
    parent.setName("parent");

    service.saveParentSt(parent);

    Child1St child1 = new Child1St();
    child1.setName("child1");
    child1.setChild1Prop("prop1");

    service.saveParentSt(child1);

    Child2St child2 = new Child2St();
    child2.setName("child2");
    child2.setChild2Prop("prop2");

    service.saveParentSt(child2);

    service.getParentSt(child2.getId()).ifPresent(c -> {
      assertThat(c.getName()).isEqualTo("child2");
    });

  }

  @Test
  public void joinedInheritance(){

    ParentJt parent = new ParentJt();
    parent.setName("parent");

    service.saveParentJt(parent);

    Child1Jt child1 = new Child1Jt();
    child1.setName("child1");
    child1.setChild1Prop("prop1");

    service.saveParentJt(child1);

    Child2Jt child2 = new Child2Jt();
    child2.setName("child2");
    child2.setChild2Prop("prop2");

    service.saveParentJt(child2);

    service.getParentJt(child2.getId()).ifPresent(c -> {
      assertThat(c.getName()).isEqualTo("child2");
    });

  }

  @Test
  public void tpcInheritance(){

    ParentTPC parent = new ParentTPC();
    parent.setName("parent");

    service.saveParentTPC(parent);

    Child1TPC child1 = new Child1TPC();
    child1.setName("child1");
    child1.setChild1Prop("prop1");

    service.saveParentTPC(child1);

    Child2TPC child2 = new Child2TPC();
    child2.setName("child2");
    child2.setChild2Prop("prop2");

    service.saveParentTPC(child2);

    service.getParentTPC(child2.getId()).ifPresent(c -> {
      assertThat(c.getName()).isEqualTo("child2");
    });

  }

  @Test
  public void msInheritance(){

    Child1Ms child1 = new Child1Ms();
    child1.setName("child1");
    child1.setChild1Prop("prop1");

    service.saveParentMs(child1);

    Child2Ms child2 = new Child2Ms();
    child2.setName("child2");
    child2.setChild2Prop("prop2");

    service.saveParentMs(child2);

    //cannot use parentRepo for queries on children when
    //using @MappedSuperclass
    service.getChild2Ms(child2.getId()).ifPresent(c -> {
      assertThat(c.getName()).isEqualTo("child2");
    });

  }

}
