package shop.samdul.greeting.entity;

import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;


@Entity
@Table(name = "todo_jpa")
@Setter
@Getter
@ToString
public class TodoEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(nullable = false)
   private String subject;
   @Column(nullable = false)
   private String body;
   private Boolean completed;
}