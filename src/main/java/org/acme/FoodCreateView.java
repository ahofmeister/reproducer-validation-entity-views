package org.acme;

import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@EntityView(Food.class)
@CreatableEntityView
public interface FoodCreateView {
  @NotNull
  String getName();

  void setName(String name);

  @IdMapping
  Long getId();


  @Min(100)
  int getDuration();

  void setDuration(int duration);


}