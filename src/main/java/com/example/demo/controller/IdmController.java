package com.example.demo.controller;

import org.flowable.idm.api.*;

import java.util.List;

/**
 * @author 蒲韵键
 * @date 2019/11/1
 */
public class IdmController implements IdmIdentityService {
    @Override
    public User newUser(String s) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUserPassword(User user) {

    }

    @Override
    public UserQuery createUserQuery() {
        return null;
    }

    @Override
    public NativeUserQuery createNativeUserQuery() {
        return null;
    }

    @Override
    public void deleteUser(String s) {

    }

    @Override
    public Group newGroup(String s) {
        return null;
    }

    @Override
    public GroupQuery createGroupQuery() {
        return null;
    }

    @Override
    public NativeGroupQuery createNativeGroupQuery() {
        return null;
    }

    @Override
    public void saveGroup(Group group) {

    }

    @Override
    public void deleteGroup(String s) {

    }

    @Override
    public void createMembership(String s, String s1) {

    }

    @Override
    public void deleteMembership(String s, String s1) {

    }

    @Override
    public boolean checkPassword(String s, String s1) {
        return false;
    }

    @Override
    public void setAuthenticatedUserId(String s) {

    }

    @Override
    public void setUserPicture(String s, Picture picture) {

    }

    @Override
    public Picture getUserPicture(String s) {
        return null;
    }

    @Override
    public Token newToken(String s) {
        return null;
    }

    @Override
    public void saveToken(Token token) {

    }

    @Override
    public void deleteToken(String s) {

    }

    @Override
    public TokenQuery createTokenQuery() {
        return null;
    }

    @Override
    public NativeTokenQuery createNativeTokenQuery() {
        return null;
    }

    @Override
    public void setUserInfo(String s, String s1, String s2) {

    }

    @Override
    public String getUserInfo(String s, String s1) {
        return null;
    }

    @Override
    public List<String> getUserInfoKeys(String s) {
        return null;
    }

    @Override
    public void deleteUserInfo(String s, String s1) {

    }

    @Override
    public Privilege createPrivilege(String s) {
        return null;
    }

    @Override
    public void addUserPrivilegeMapping(String s, String s1) {

    }

    @Override
    public void deleteUserPrivilegeMapping(String s, String s1) {

    }

    @Override
    public void addGroupPrivilegeMapping(String s, String s1) {

    }

    @Override
    public void deleteGroupPrivilegeMapping(String s, String s1) {

    }

    @Override
    public List<PrivilegeMapping> getPrivilegeMappingsByPrivilegeId(String s) {
        return null;
    }

    @Override
    public void deletePrivilege(String s) {

    }

    @Override
    public List<User> getUsersWithPrivilege(String s) {
        return null;
    }

    @Override
    public List<Group> getGroupsWithPrivilege(String s) {
        return null;
    }

    @Override
    public PrivilegeQuery createPrivilegeQuery() {
        return null;
    }
}
