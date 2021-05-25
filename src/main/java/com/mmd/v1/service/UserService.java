package com.mmd.v1.service;

import java.util.List;
import org.springframework.data.domain.Page;
import com.mmd.v1.model.UserModel;


public interface UserService {
	
	List<UserModel> getAllUsers();
	void saveUser(UserModel user);
	UserModel getUserById(long id);
	void deleteUserById(long id);
	void editUser(UserModel user);
	Page<UserModel> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
