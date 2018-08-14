/*
Navicat MySQL Data Transfer

Source Server         : XIYE
Source Server Version : 50520
Source Host           : 127.0.0.1:3306
Source Database       : travel

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2018-07-21 14:48:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `act_id` int(11) NOT NULL AUTO_INCREMENT,
  `act_user_id` int(11) DEFAULT NULL,
  `act_name` varchar(50) DEFAULT NULL,
  `act_desc` varchar(100) DEFAULT NULL,
  `act_city` varchar(50) DEFAULT NULL,
  `act_amount` int(11) DEFAULT NULL,
  `act_apply_amount` int(11) DEFAULT NULL,
  `act_begin_date` date DEFAULT NULL,
  `act_end_date` date DEFAULT NULL,
  PRIMARY KEY (`act_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity
-- ----------------------------

-- ----------------------------
-- Table structure for activity_message
-- ----------------------------
DROP TABLE IF EXISTS `activity_message`;
CREATE TABLE `activity_message` (
  `act_msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `act_msg_fuser` int(11) DEFAULT NULL,
  `act_id` int(11) DEFAULT NULL,
  `act_msg_content` varchar(100) DEFAULT NULL,
  `act_msg_date` datetime DEFAULT NULL,
  PRIMARY KEY (`act_msg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity_message
-- ----------------------------
INSERT INTO `activity_message` VALUES ('1', '1', '1', '这个活动真好', '2018-07-21 00:00:00');

-- ----------------------------
-- Table structure for apply
-- ----------------------------
DROP TABLE IF EXISTS `apply`;
CREATE TABLE `apply` (
  `apply_id` int(11) NOT NULL AUTO_INCREMENT,
  `apply_suser` int(11) DEFAULT NULL,
  `apply_condition` varchar(50) DEFAULT NULL,
  `apply_fuser` int(11) DEFAULT NULL,
  PRIMARY KEY (`apply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apply
-- ----------------------------

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `city_id` int(11) NOT NULL AUTO_INCREMENT,
  `city_name` varchar(50) DEFAULT NULL,
  `city_pro_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------

-- ----------------------------
-- Table structure for city_senic
-- ----------------------------
DROP TABLE IF EXISTS `city_senic`;
CREATE TABLE `city_senic` (
  `city_sen_id` int(11) NOT NULL AUTO_INCREMENT,
  `city_id` int(11) DEFAULT NULL,
  `sen_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`city_sen_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city_senic
-- ----------------------------

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `g_id` int(11) NOT NULL AUTO_INCREMENT,
  `g_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`g_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group
-- ----------------------------

-- ----------------------------
-- Table structure for group_permission
-- ----------------------------
DROP TABLE IF EXISTS `group_permission`;
CREATE TABLE `group_permission` (
  `group_permission` int(11) NOT NULL AUTO_INCREMENT,
  `g_id` int(11) DEFAULT NULL,
  `p_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`group_permission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group_permission
-- ----------------------------

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `p_id` int(11) NOT NULL,
  `p_name` varchar(50) DEFAULT NULL,
  `p_desc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `pic_id` int(11) NOT NULL AUTO_INCREMENT,
  `pic_path` varchar(50) DEFAULT NULL,
  `sen_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of picture
-- ----------------------------

-- ----------------------------
-- Table structure for place_remark
-- ----------------------------
DROP TABLE IF EXISTS `place_remark`;
CREATE TABLE `place_remark` (
  `pla_re_id` int(11) NOT NULL AUTO_INCREMENT,
  `pla_re_date` datetime DEFAULT NULL,
  `pla_re_content` varchar(50) DEFAULT NULL,
  `pla_re_mark` int(11) DEFAULT NULL COMMENT '点赞数',
  PRIMARY KEY (`pla_re_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of place_remark
-- ----------------------------

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `pro_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of province
-- ----------------------------

-- ----------------------------
-- Table structure for senic
-- ----------------------------
DROP TABLE IF EXISTS `senic`;
CREATE TABLE `senic` (
  `sen_id` int(11) NOT NULL AUTO_INCREMENT,
  `sen_name` varchar(50) DEFAULT NULL,
  `sen_desc` varchar(300) DEFAULT NULL,
  `sen_city` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sen_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of senic
-- ----------------------------

-- ----------------------------
-- Table structure for son_remark
-- ----------------------------
DROP TABLE IF EXISTS `son_remark`;
CREATE TABLE `son_remark` (
  `son_re_id` int(11) NOT NULL AUTO_INCREMENT,
  `son_re_content` varchar(50) DEFAULT NULL,
  `son_re_date` datetime DEFAULT NULL,
  `son_re_to` int(11) DEFAULT NULL,
  `son_re_my` int(11) DEFAULT NULL,
  PRIMARY KEY (`son_re_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of son_remark
-- ----------------------------

-- ----------------------------
-- Table structure for trip
-- ----------------------------
DROP TABLE IF EXISTS `trip`;
CREATE TABLE `trip` (
  `trip_id` int(11) NOT NULL AUTO_INCREMENT,
  `trip_name` varchar(50) DEFAULT NULL,
  `trip_addr` varchar(50) DEFAULT NULL,
  `trip_phone` varchar(50) DEFAULT NULL,
  `trip_email` varchar(50) DEFAULT NULL,
  `trip_desc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`trip_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trip
-- ----------------------------

-- ----------------------------
-- Table structure for usermessage
-- ----------------------------
DROP TABLE IF EXISTS `usermessage`;
CREATE TABLE `usermessage` (
  `um_id` int(11) NOT NULL AUTO_INCREMENT,
  `um_content` varchar(50) DEFAULT NULL,
  `um_time` datetime DEFAULT NULL,
  `um_sendId` int(11) DEFAULT NULL,
  `um_getId` int(11) DEFAULT NULL,
  `um_state` varchar(50) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`um_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usermessage
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL,
  `user_pwd` varchar(20) DEFAULT NULL,
  `user_address` varchar(20) DEFAULT NULL,
  `user_phone` varchar(30) DEFAULT NULL,
  `user_email` varchar(50) DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_qq` varchar(50) DEFAULT NULL,
  `user_photo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------

-- ----------------------------
-- Table structure for user_act_msg
-- ----------------------------
DROP TABLE IF EXISTS `user_act_msg`;
CREATE TABLE `user_act_msg` (
  `user_act_msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `act_msg_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_act_msg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_act_msg
-- ----------------------------

-- ----------------------------
-- Table structure for user_group
-- ----------------------------
DROP TABLE IF EXISTS `user_group`;
CREATE TABLE `user_group` (
  `user_group_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `g_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_group
-- ----------------------------

-- ----------------------------
-- Table structure for user_message
-- ----------------------------
DROP TABLE IF EXISTS `user_message`;
CREATE TABLE `user_message` (
  `user_msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `usermsg_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_msg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_message
-- ----------------------------

-- ----------------------------
-- Table structure for user_place_re
-- ----------------------------
DROP TABLE IF EXISTS `user_place_re`;
CREATE TABLE `user_place_re` (
  `user_pla_re_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `pla_re_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_pla_re_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_place_re
-- ----------------------------
