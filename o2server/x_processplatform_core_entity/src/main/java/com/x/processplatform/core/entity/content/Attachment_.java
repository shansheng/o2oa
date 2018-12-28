/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.StorageObject_;
import com.x.processplatform.core.entity.element.ActivityType;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.processplatform.core.entity.content.Attachment.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Mon Dec 24 19:04:55 CST 2018")
public class Attachment_ extends StorageObject_  {
    public static volatile SingularAttribute<Attachment,String> activity;
    public static volatile SingularAttribute<Attachment,String> activityName;
    public static volatile SingularAttribute<Attachment,String> activityToken;
    public static volatile SingularAttribute<Attachment,ActivityType> activityType;
    public static volatile SingularAttribute<Attachment,String> application;
    public static volatile SingularAttribute<Attachment,Boolean> completed;
    public static volatile SingularAttribute<Attachment,String> extension;
    public static volatile SingularAttribute<Attachment,String> id;
    public static volatile SingularAttribute<Attachment,String> job;
    public static volatile SingularAttribute<Attachment,String> lastUpdatePerson;
    public static volatile SingularAttribute<Attachment,Date> lastUpdateTime;
    public static volatile SingularAttribute<Attachment,Long> length;
    public static volatile SingularAttribute<Attachment,String> name;
    public static volatile SingularAttribute<Attachment,String> person;
    public static volatile SingularAttribute<Attachment,String> process;
    public static volatile SingularAttribute<Attachment,String> site;
    public static volatile SingularAttribute<Attachment,String> storage;
    public static volatile SingularAttribute<Attachment,String> type;
    public static volatile SingularAttribute<Attachment,String> work;
    public static volatile SingularAttribute<Attachment,String> workCompleted;
    public static volatile SingularAttribute<Attachment,Date> workCreateTime;
}