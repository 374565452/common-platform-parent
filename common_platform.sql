/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50132
Source Host           : localhost:3306
Source Database       : common_platform

Target Server Type    : MYSQL
Target Server Version : 50132
File Encoding         : 65001

Date: 2017-04-01 08:40:01
*/

SET FOREIGN_KEY_CHECKS=0;

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_district
-- ----------------------------
INSERT INTO `tbl_district` VALUES ('0', '通用平台', '通用平台', '通用平台', '-1', '-1', null, null, '2017-03-31 14:49:35', '2017-03-31 14:49:38', '0', '顶级区域');
INSERT INTO `tbl_district` VALUES ('1', '徐州市', '5066549580791808', null, '1', '0', null, null, '2017-03-31 14:59:09', '2017-03-31 14:59:22', '0', null);
INSERT INTO `tbl_district` VALUES ('2', '铜山区', '5066824458698752', '1407649761460224', '2', '1', '117.175546', '34.186143', '2017-03-31 15:01:09', '2017-03-31 15:01:12', '0', null);
INSERT INTO `tbl_district` VALUES ('3', '三河尖街道', '5066824525807616', '1407649828569088', '3', '2', '117.165601', '34.303358', '2017-03-31 15:03:52', '2017-03-31 15:03:54', '0', null);
INSERT INTO `tbl_district` VALUES ('4', '铜山街道', '5066825062678528', '1407650365440000', '3', '2', '117.165867', '34.192592', '2017-03-31 15:06:33', '2017-03-31 15:06:36', '0', null);
INSERT INTO `tbl_district` VALUES ('5', '同昌社区', '5066825062973440', '1407650365456384', '4', '4', '117.193295', '34.194465', '2017-03-31 15:07:27', '2017-03-31 15:07:30', '0', null);
INSERT INTO `tbl_district` VALUES ('6', '汉沟村', '5066825063071744', '1407650365554688', '4', '4', null, null, '2017-03-31 15:08:45', '2017-03-31 15:08:47', '0', null);

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_dis_level
-- ----------------------------
INSERT INTO `tbl_dis_level` VALUES ('-1', '系统默认顶级区域', '2017-03-31 14:41:37', '0', '系统默认顶级区域-不允许删除');
INSERT INTO `tbl_dis_level` VALUES ('0', '省级区域', '2017-03-31 14:41:37', '0', '省级区域');
INSERT INTO `tbl_dis_level` VALUES ('1', '市级区域', '2017-03-31 14:41:37', '0', null);
INSERT INTO `tbl_dis_level` VALUES ('2', '县级区域', '2017-03-31 14:41:37', '0', null);
INSERT INTO `tbl_dis_level` VALUES ('3', '镇级区域', '2017-03-31 14:41:37', '0', null);
INSERT INTO `tbl_dis_level` VALUES ('4', '村级区域', '2017-03-31 14:41:37', '0', null);

-- ----------------------------
-- Table structure for `tbl_module`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_module`;
CREATE TABLE `tbl_module` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `module_key` varchar(255) NOT NULL,
  `module_name` varchar(255) NOT NULL,
  `module_url` varchar(1000) DEFAULT NULL,
  `level` int(11) NOT NULL DEFAULT '0' COMMENT '层级关系',
  `parent_id` bigint(20) NOT NULL DEFAULT '0',
  `order_no` int(11) DEFAULT NULL,
  `check_usb_key` int(1) NOT NULL DEFAULT '0',
  `created_date` datetime NOT NULL,
  `only_for_role_id` bigint(20) NOT NULL DEFAULT '0',
  `updated_date` datetime NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '删除标识',
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_module
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_staff
-- ----------------------------
INSERT INTO `tbl_staff` VALUES ('1', 'admin', 'admin', '1', '2017-03-31 14:46:27', '1', '2017-03-31 14:46:31', '0', null);

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
