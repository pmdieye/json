package controllers;

import play.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import models.Project;
import models.Task;
import models.UserAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJson extends Controller {

	public static Result tasks_json() {
		List<Task> tasks = Task.findAll();
		return ok(Json.toJson(tasks));

	}

}
