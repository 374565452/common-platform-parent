/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50132
Source Host           : localhost:3306
Source Database       : common_platform

Target Server Type    : MYSQL
Target Server Version : 50132
File Encoding         : 65001

Date: 2017-04-10 14:21:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_device`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_device`;
CREATE TABLE `tbl_device` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) NOT NULL DEFAULT '-1',
  `device_code` varchar(30) NOT NULL,
  `device_name` varchar(30) DEFAULT NULL,
  `device_type_id` int(11) NOT NULL,
  `device_status` int(11) NOT NULL DEFAULT '0',
  `district_id` bigint(20) NOT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `vol` int(11) NOT NULL DEFAULT '15',
  `deleted` int(11) NOT NULL DEFAULT '0',
  `remark` varchar(1000) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_device
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_device_type`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_device_type`;
CREATE TABLE `tbl_device_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(30) NOT NULL,
  `type_desc` varchar(1000) DEFAULT NULL,
  `deleted` int(11) NOT NULL DEFAULT '0',
  `created_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_device_type
-- ----------------------------
INSERT INTO `tbl_device_type` VALUES ('1', '设备类型1', ' 测试设备类型', '0', '2017-04-10 13:42:57');
INSERT INTO `tbl_device_type` VALUES ('2', '设类型2', ' 测试设备类型', '0', '2017-04-10 13:43:14');

-- ----------------------------
-- Table structure for `tbl_district`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_district`;
CREATE TABLE `tbl_district` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dis_name` varchar(100) NOT NULL,
  `dis_code` varchar(20) NOT NULL,
  `dis_logic_address` varchar(20) DEFAULT NULL,
  `area_level_id` bigint(20) NOT NULL,
  `parent_id` bigint(20) NOT NULL,
  `longitude` double DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `created_date` datetime NOT NULL,
  `updated_date` datetime NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_district
-- ----------------------------
INSERT INTO `tbl_district` VALUES ('1', '徐州市', '5066549580791808', null, '1', '0', null, null, '2017-03-31 14:59:09', '2017-03-31 14:59:22', '0', null);
INSERT INTO `tbl_district` VALUES ('2', '铜山区', '5066824458698752', '1407649761460224', '2', '1', '117.175546', '34.186143', '2017-03-31 15:01:09', '2017-03-31 15:01:12', '0', null);
INSERT INTO `tbl_district` VALUES ('3', '三河尖街道', '5066824525807616', '1407649828569088', '3', '2', '117.165601', '34.303358', '2017-03-31 15:03:52', '2017-03-31 15:03:54', '0', null);
INSERT INTO `tbl_district` VALUES ('4', '铜山街道', '5066825062678528', '1407650365440000', '3', '2', '117.165867', '34.192592', '2017-03-31 15:06:33', '2017-03-31 15:06:36', '0', null);
INSERT INTO `tbl_district` VALUES ('5', '同昌社区', '5066825062973440', '1407650365456384', '4', '4', '117.193295', '34.194465', '2017-03-31 15:07:27', '2017-03-31 15:07:30', '0', null);
INSERT INTO `tbl_district` VALUES ('6', '汉沟村', '5066825063071744', '1407650365554688', '4', '4', null, null, '2017-03-31 15:08:45', '2017-03-31 15:08:47', '0', null);
INSERT INTO `tbl_district` VALUES ('7', '通用平台', '通用平台', '通用平台', '-1', '-1', null, null, '2017-03-31 14:49:35', '2017-03-31 14:49:38', '0', '顶级区域');
INSERT INTO `tbl_district` VALUES ('8', 'test1', '1', '1', '2', '1', '1', '1', '2017-04-06 15:23:44', '2017-04-06 15:23:44', '0', '');
INSERT INTO `tbl_district` VALUES ('9', 'test2311111', '23', '23', '2', '1', '23', '23', '2017-04-06 15:23:57', '2017-04-06 16:58:04', '0', '');
INSERT INTO `tbl_district` VALUES ('11', '123', '13', '13', '3', '8', '13', '13', '2017-04-06 16:57:53', '2017-04-06 16:57:53', '0', '');

-- ----------------------------
-- Table structure for `tbl_dis_level`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dis_level`;
CREATE TABLE `tbl_dis_level` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dis_level_name` varchar(225) NOT NULL,
  `create_date` datetime NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_dis_level
-- ----------------------------
INSERT INTO `tbl_dis_level` VALUES ('-1', '系统默认顶级区域', '2017-03-31 14:41:37', '0', '系统默认顶级区域-不允许删除');
INSERT INTO `tbl_dis_level` VALUES ('1', '市级区域', '2017-03-31 14:41:37', '0', null);
INSERT INTO `tbl_dis_level` VALUES ('2', '县级区域', '2017-03-31 14:41:37', '0', null);
INSERT INTO `tbl_dis_level` VALUES ('3', '镇级区域', '2017-03-31 14:41:37', '0', null);
INSERT INTO `tbl_dis_level` VALUES ('4', '村级区域', '2017-03-31 14:41:37', '0', null);
INSERT INTO `tbl_dis_level` VALUES ('5', '省级区域', '2017-03-31 14:41:37', '0', '省级区域');

-- ----------------------------
-- Table structure for `tbl_module`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_module`;
CREATE TABLE `tbl_module` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `module_key` varchar(255) NOT NULL,
  `module_name` varchar(255) NOT NULL,
  `module_url` varchar(1000) DEFAULT NULL,
  `module_icon` varchar(255) DEFAULT NULL,
  `level` int(11) NOT NULL DEFAULT '0' COMMENT '层级关系',
  `parent_id` bigint(20) NOT NULL DEFAULT '0',
  `order_no` int(11) DEFAULT NULL,
  `check_usb_key` int(1) NOT NULL DEFAULT '0',
  `created_date` datetime NOT NULL,
  `only_for_role_id` bigint(20) NOT NULL DEFAULT '0',
  `updated_date` datetime NOT NULL,
  `default_moule` int(11) NOT NULL DEFAULT '0',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '删除标识',
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_module
-- ----------------------------
INSERT INTO `tbl_module` VALUES ('1', 'm_home', '首页', '#', 'icon icon-dashboard', '1', '0', '1', '0', '2017-04-06 15:43:07', '0', '2017-04-06 15:43:15', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('2', 'm_authority', '权限设置', 'javascript:void(0)', 'icon icon-key', '1', '0', '8', '0', '2017-04-06 15:44:39', '0', '2017-04-06 15:44:44', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('3', 'm_basedata', '基础数据', 'javascript:void(0)', 'icon icon-cogs', '1', '0', '9', '0', '2017-04-06 15:45:21', '0', '2017-04-06 15:45:25', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('4', 'm_other', '其他信息', 'javascript:void(0)', 'icon icon-dashboard', '1', '0', '10', '0', '2017-04-06 15:45:50', '0', '2017-04-06 15:45:53', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('5', 'm_authority_role', '角色管理 ', 'common/platform/c_role', null, '2', '2', '81', '0', '2017-04-06 15:47:09', '0', '2017-04-06 15:47:12', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('6', 'm_authority_module', '模块管理', 'common/platform/c_module', null, '2', '2', '82', '0', '2017-04-06 15:47:45', '0', '2017-04-06 15:47:48', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('7', 'm_authority_district', '区域管理', 'common/platform/c_district', null, '2', '2', '83', '0', '2017-04-06 15:49:04', '0', '2017-04-06 15:49:11', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('8', 'm_basedata_config', '参数配置', 'common/platform/c_config', null, '2', '3', '91', '0', '2017-04-06 15:49:52', '0', '2017-04-06 15:49:56', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('9', 'm_basedata_user', '用户管理', 'common/platform/c_user', null, '2', '3', '92', '0', '2017-04-06 15:50:26', '0', '2017-04-06 15:50:28', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('11', 'm_device', ' 设备管理', 'javascript:void(0)', 'icon icon-file-archive', '1', '0', '2', '0', '2017-04-10 14:19:11', '0', '2017-04-10 14:19:16', '0', '0', null);
INSERT INTO `tbl_module` VALUES ('12', 'm_device_list', ' 设备列表', 'common/platform/c_device_list', null, '2', '11', '21', '0', '2017-04-10 14:20:35', '0', '2017-04-10 14:20:42', '0', '0', null);

-- ----------------------------
-- Table structure for `tbl_role`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_role`;
CREATE TABLE `tbl_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dis_level_id` bigint(20) NOT NULL,
  `role_name` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `updated_date` datetime NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_role
-- ----------------------------
INSERT INTO `tbl_role` VALUES ('1', '0', '系统管理员', '2017-03-31 14:44:42', '2017-03-31 14:44:45', '0', '系统管理员');

-- ----------------------------
-- Table structure for `tbl_role_module`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_role_module`;
CREATE TABLE `tbl_role_module` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) NOT NULL,
  `module_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_role_module
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_staff`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_staff`;
CREATE TABLE `tbl_staff` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `userPassword` varchar(100) NOT NULL,
  `create_by` bigint(20) DEFAULT '0',
  `create_date` datetime DEFAULT NULL,
  `update_by` bigint(20) DEFAULT '0',
  `update_date` datetime DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_staff
-- ----------------------------
INSERT INTO `tbl_staff` VALUES ('1', 'admin', 'admin', '1', '2017-03-31 14:46:27', '1', '2017-03-31 14:46:31', '0', '');
INSERT INTO `tbl_staff` VALUES ('2', 'test1', 'test2', '1', '2017-04-07 14:47:55', '1', '2017-04-07 14:47:58', '0', null);
INSERT INTO `tbl_staff` VALUES ('3', 'test3', 'test3', '1', '2017-04-07 14:48:13', '1', '2017-04-07 14:48:17', '0', null);
INSERT INTO `tbl_staff` VALUES ('4', 'test4', 'test4', '1', '2017-04-07 14:48:40', '1', '2017-04-07 14:48:45', '0', null);
INSERT INTO `tbl_staff` VALUES ('5', 'test5', 'test5', '1', '2017-04-07 14:49:07', '1', '2017-04-07 14:49:09', '0', null);
INSERT INTO `tbl_staff` VALUES ('6', 'test6', 'test6', '1', '2017-04-07 14:49:26', '1', '2017-04-07 14:49:30', '0', null);
INSERT INTO `tbl_staff` VALUES ('7', 'test7', 'test7', '1', '2017-04-07 14:49:40', '1', '2017-04-07 14:49:44', '0', null);
INSERT INTO `tbl_staff` VALUES ('8', 'test8', 'test8', '1', '2017-04-07 14:49:54', '1', '2017-04-07 14:49:57', '0', null);
INSERT INTO `tbl_staff` VALUES ('9', 'test9', 'test9', '1', '2017-04-07 14:50:07', '1', '2017-04-07 14:50:10', '0', null);
INSERT INTO `tbl_staff` VALUES ('10', 'test11', 'test11', '1', '2017-04-07 14:50:19', '1', '2017-04-07 14:50:22', '0', null);

-- ----------------------------
-- Table structure for `tbl_staff_role_dis`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_staff_role_dis`;
CREATE TABLE `tbl_staff_role_dis` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `staff_id` bigint(20) NOT NULL,
  `district_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_staff_role_dis
-- ----------------------------
INSERT INTO `tbl_staff_role_dis` VALUES ('1', '1', '1', '1');

-- ----------------------------
-- Table structure for `tbl_user`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', '1', '1');
INSERT INTO `tbl_user` VALUES ('2', '2', '2');
INSERT INTO `tbl_user` VALUES ('3', '3', '3');
