<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add new feed</title>
    
    <style><%@include file="../styles/addFeed.css"%></style>
    <style><%@include file="../styles/navbar_profilesTab.css"%></style>
    
</head>
<body>
    <div class="navbar">
        <div class="inputWrap">
            <a href="dashboard.html">
                <svg class="logo" width="48" height="36" viewBox="0 0 48 36" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M20.64 0.755644C21.6903 0.258094 22.8379 0 24 0C25.1622 0 26.3098 0.258094 27.36 0.755644L46.856 9.99164C47.1956 10.1524 47.4831 10.4055 47.6855 10.7221C47.8879 11.0387 47.997 11.4059 48.0003 11.7816C48.0037 12.1573 47.9011 12.5264 47.7044 12.8465C47.5077 13.1667 47.2247 13.4249 46.888 13.5916L27.488 23.2156C26.404 23.7535 25.2102 24.0334 24 24.0334C22.7899 24.0334 21.5961 23.7535 20.512 23.2156L4.00002 15.0236V23.9996C4.00002 24.5301 3.78931 25.0388 3.41423 25.4139C3.03916 25.7889 2.53045 25.9996 2.00002 25.9996C1.46959 25.9996 0.96088 25.7889 0.585807 25.4139C0.210734 25.0388 2.03059e-05 24.5301 2.03059e-05 23.9996V11.9996V11.8996C-0.0185743 11.5043 0.0800979 11.1122 0.283639 10.7727C0.48718 10.4333 0.786511 10.1615 1.14402 9.99164L20.64 0.751644V0.755644ZM8.00002 21.4756V27.9996C8.00008 28.2627 8.05204 28.5232 8.15294 28.7662C8.25384 29.0092 8.40169 29.2299 8.58802 29.4156L8.59602 29.4276L8.68802 29.5116L8.92802 29.7356C10.1816 30.8529 11.5368 31.8506 12.976 32.7156C15.648 34.3196 19.508 35.9996 24 35.9996C28.492 35.9996 32.352 34.3196 35.028 32.7156C36.4672 31.8506 37.8225 30.8529 39.076 29.7356L39.316 29.5116L39.38 29.4476L39.404 29.4236L39.408 29.4196L39.416 29.4156C39.6016 29.2296 39.7487 29.0087 39.8489 28.7658C39.9492 28.5228 40.0005 28.2625 40 27.9996V21.4716L29.264 26.7996C27.6279 27.6111 25.8263 28.0332 24 28.0332C22.1737 28.0332 20.3722 27.6111 18.736 26.7996L8.00002 21.4716V21.4756Z" fill="#0FBCF9"/>
                </svg>
            </a>
           
                
            <input class="search" type="text" placeholder="search">
            <a href="./search.html">
                <svg class="searchIcon" width="36" height="36" viewBox="0 0 36 36"  xmlns="http://www.w3.org/2000/svg"> <g clip-path="url(#clip0)"> <path fill="#292929" d="M26.4195 23.2742C28.5982 20.3013 29.574 16.6153 29.1517 12.9538C28.7294 9.2923 26.9402 5.92524 24.142 3.52627C21.3438 1.1273 17.7429 -0.126666 14.0599 0.0152487C10.3768 0.157163 6.88316 1.68449 4.27784 4.29167C1.67253 6.89885 0.147704 10.3936 0.00842528 14.0768C-0.130854 17.7599 1.12569 21.3598 3.52666 24.1563C5.92763 26.9528 9.29597 28.7396 12.9578 29.1593C16.6196 29.579 20.3049 28.6005 23.2762 26.4197H23.274C23.3415 26.5097 23.4135 26.5952 23.4945 26.6785L32.157 35.341C32.5789 35.7632 33.1512 36.0005 33.7481 36.0007C34.3449 36.0009 34.9174 35.764 35.3396 35.3421C35.7618 34.9202 35.9991 34.3479 35.9993 33.751C35.9995 33.1542 35.7626 32.5817 35.3407 32.1595L26.6782 23.497C26.5978 23.4155 26.5113 23.3403 26.4195 23.272V23.2742ZM27 14.6252C27 16.2503 26.6799 17.8595 26.058 19.3609C25.4361 20.8623 24.5246 22.2265 23.3754 23.3757C22.2263 24.5248 20.8621 25.4363 19.3607 26.0582C17.8593 26.6801 16.2501 27.0002 14.625 27.0002C12.9999 27.0002 11.3907 26.6801 9.88928 26.0582C8.38788 25.4363 7.02367 24.5248 5.87454 23.3757C4.72542 22.2265 3.81388 20.8623 3.19198 19.3609C2.57008 17.8595 2.24999 16.2503 2.24999 14.6252C2.24999 11.3432 3.55378 8.19554 5.87455 5.87478C8.19531 3.55402 11.3429 2.25023 14.625 2.25023C17.907 2.25023 21.0547 3.55402 23.3754 5.87478C25.6962 8.19554 27 11.3432 27 14.6252V14.6252Z" fill="black"/> </g> <defs> <clipPath id="clip0"> <rect width="36" height="36" fill="white"/> </clipPath> </defs> </svg>
            </a>
        </div>
        <a href="./About.html" class="aboutlink">About us</a>
        <div class="sign_in_or_out">
            |
            <a href="${pageContext.request.contextPath}/signout" class="signOut">Sign out</a>
        </div>
    </div>
    <div class="profileTab">
        <div class="detailsContainer">
            <div class="imgWrap">
                <img class="dp" src="../media/avatars/zen.jpg"></img>
            </div>
            <div class="name">
                Zendaya
            </div>
            
        </div>
        <div class="links">
            <a class="link" href="dashboard.html#About">
                <div class="wrap">
                    <svg width="48" height="48" viewBox="0 0 48 48" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M35.3158 38.2105H10.6842L5 43.8947V11.6842C5 8.55789 7.55789 6 10.6842 6H35.3158C38.4421 6 41 8.55789 41 11.6842V32.5263C41 35.6526 38.4421 38.2105 35.3158 38.2105Z" fill="white"/> <path d="M22 20H26V31H22V20Z" fill="#0266C7"/> <path d="M24 17C25.1046 17 26 16.1046 26 15C26 13.8954 25.1046 13 24 13C22.8954 13 22 13.8954 22 15C22 16.1046 22.8954 17 24 17Z" fill="#0266C7"/> </svg>
                    <p >About me</p>
                </div>
            </a>

            <a class="link" href="dashboard.html#Education">
                <div class="wrap">
                    <svg width="36" height="36" viewBox="0 0 36 36" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M5.994 14.4L18 21.6L36 10.8L18 0L0 10.8H18V14.4H5.994ZM0 14.4V28.8L3.6 24.804V16.56L0 14.4ZM18 36L9 30.6L5.4 28.44V17.64L18 25.2L30.6 17.64V28.44L18 36Z" fill="white"/> </svg>
                    <p >Education</p>
                </div>
            </a>

            <a class="link" href="dashboard.html#Certifications">
               <div class="wrap">
                    <svg width="40" height="40" viewBox="0 0 40 40" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M8 6C6.93913 6 5.92172 6.42143 5.17157 7.17157C4.42143 7.92172 4 8.93913 4 10V26C4 27.0609 4.42143 28.0783 5.17157 28.8284C5.92172 29.5786 6.93913 30 8 30H23V28.658C22.8288 28.4461 22.6673 28.2265 22.516 28H8C7.46957 28 6.96086 27.7893 6.58579 27.4142C6.21071 27.0391 6 26.5304 6 26V10C6 9.46957 6.21071 8.96086 6.58579 8.58579C6.96086 8.21071 7.46957 8 8 8H32C32.5304 8 33.0391 8.21071 33.4142 8.58579C33.7893 8.96086 34 9.46957 34 10V14.936C34.728 15.296 35.4 15.756 36 16.292V10C36 8.93913 35.5786 7.92172 34.8284 7.17157C34.0783 6.42143 33.0609 6 32 6H8Z" fill="white"/> <path d="M37 23C37 24.8565 36.2625 26.637 34.9497 27.9497C33.637 29.2625 31.8565 30 30 30C28.1435 30 26.363 29.2625 25.0503 27.9497C23.7375 26.637 23 24.8565 23 23C23 21.1435 23.7375 19.363 25.0503 18.0503C26.363 16.7375 28.1435 16 30 16C31.8565 16 33.637 16.7375 34.9497 18.0503C36.2625 19.363 37 21.1435 37 23V23Z" fill="white"/> <path d="M30 31.9999C31.85 31.9999 33.57 31.4399 35 30.4839V35.9999C35 36.1856 34.9483 36.3676 34.8507 36.5256C34.753 36.6836 34.6133 36.8113 34.4472 36.8943C34.2811 36.9774 34.0952 37.0125 33.9102 36.9958C33.7252 36.9792 33.5486 36.9113 33.4 36.7999L30.6 34.6999C30.4269 34.5701 30.2164 34.4999 30 34.4999C29.7836 34.4999 29.5731 34.5701 29.4 34.6999L26.6 36.7999C26.4514 36.9113 26.2748 36.9792 26.0898 36.9958C25.9048 37.0125 25.7189 36.9774 25.5528 36.8943C25.3867 36.8113 25.247 36.6836 25.1493 36.5256C25.0517 36.3676 25 36.1856 25 35.9999V30.4839C26.4789 31.4749 28.2197 32.0027 30 31.9999Z" fill="white"/> <path d="M10 13C10 12.7348 10.1054 12.4804 10.2929 12.2929C10.4804 12.1054 10.7348 12 11 12H29C29.2652 12 29.5196 12.1054 29.7071 12.2929C29.8946 12.4804 30 12.7348 30 13C30 13.2652 29.8946 13.5196 29.7071 13.7071C29.5196 13.8946 29.2652 14 29 14H11C10.7348 14 10.4804 13.8946 10.2929 13.7071C10.1054 13.5196 10 13.2652 10 13Z" fill="white"/> <path d="M11 22C10.7348 22 10.4804 22.1054 10.2929 22.2929C10.1054 22.4804 10 22.7348 10 23C10 23.2652 10.1054 23.5196 10.2929 23.7071C10.4804 23.8946 10.7348 24 11 24H19C19.2652 24 19.5196 23.8946 19.7071 23.7071C19.8946 23.5196 20 23.2652 20 23C20 22.7348 19.8946 22.4804 19.7071 22.2929C19.5196 22.1054 19.2652 22 19 22H11Z" fill="white"/> </svg>
                    <p  >Certifications</p>
               </div>
            </a>
            <a class="link" href="dashboard.html#Skills">
                <div class="wrap">
                    <svg width="36" height="36" viewBox="0 0 36 36" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M33.75 33.75H24.75V4.5H33.75V33.75Z" fill="white"/> <path d="M22.5 33.75H13.5V13.5H22.5V33.75Z" fill="white"/> <path d="M11.25 33.75H2.25V20.25H11.25V33.75Z" fill="white"/> </svg>
                    <p >Skills</p>
                </div>
            </a>
            <a class="link" href="feeds.html">
                <div class="wrap">
                    <svg width="16" height="14" viewBox="0 0 16 14" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M1.5 0C1.10218 0 0.720644 0.158035 0.43934 0.43934C0.158035 0.720644 0 1.10218 0 1.5V5.5C0 5.89782 0.158035 6.27936 0.43934 6.56066C0.720644 6.84196 1.10218 7 1.5 7H14.5C14.8978 7 15.2794 6.84196 15.5607 6.56066C15.842 6.27936 16 5.89782 16 5.5V1.5C16 1.10218 15.842 0.720644 15.5607 0.43934C15.2794 0.158035 14.8978 0 14.5 0H1.5ZM1.5 9C1.10218 9 0.720644 9.15804 0.43934 9.43934C0.158035 9.72064 0 10.1022 0 10.5V12.5C0 12.8978 0.158035 13.2794 0.43934 13.5607C0.720644 13.842 1.10218 14 1.5 14H5.5C5.89782 14 6.27936 13.842 6.56066 13.5607C6.84196 13.2794 7 12.8978 7 12.5V10.5C7 10.1022 6.84196 9.72064 6.56066 9.43934C6.27936 9.15804 5.89782 9 5.5 9H1.5ZM10.5 9C10.1022 9 9.72064 9.15804 9.43934 9.43934C9.15804 9.72064 9 10.1022 9 10.5V12.5C9 12.8978 9.15804 13.2794 9.43934 13.5607C9.72064 13.842 10.1022 14 10.5 14H14.5C14.8978 14 15.2794 13.842 15.5607 13.5607C15.842 13.2794 16 12.8978 16 12.5V10.5C16 10.1022 15.842 9.72064 15.5607 9.43934C15.2794 9.15804 14.8978 9 14.5 9H10.5Z" fill="white"/> </svg>
                    <p >Feeds</p>
                </div>
            </a>
            
            <a class="link" href="profile-settings.html">
                <div class="wrap">
                    <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M10 11.5C10.8284 11.5 11.5 10.8284 11.5 10C11.5 9.17157 10.8284 8.5 10 8.5C9.17157 8.5 8.5 9.17157 8.5 10C8.5 10.8284 9.17157 11.5 10 11.5Z" fill="white"/> <path d="M18.32 7.37H17.23C17.09 7.37 16.99 7.26 16.93 7.11C16.8943 7.05491 16.8753 6.99066 16.8753 6.925C16.8753 6.85934 16.8943 6.79509 16.93 6.74L17.74 6C17.8987 5.8473 18.0249 5.66401 18.1108 5.4612C18.1968 5.25839 18.2407 5.04027 18.24 4.82C18.2398 4.59839 18.1955 4.37905 18.1096 4.17474C18.0238 3.97043 17.8981 3.78526 17.74 3.63L16.4 2.26C16.2448 2.10368 16.0602 1.97962 15.8568 1.89497C15.6534 1.81031 15.4353 1.76672 15.215 1.76672C14.9947 1.76672 14.7766 1.81031 14.5732 1.89497C14.3698 1.97962 14.1852 2.10368 14.03 2.26L13.26 3C13.1988 3.0392 13.1277 3.06004 13.055 3.06004C12.9823 3.06004 12.9112 3.0392 12.85 3C12.7896 2.97748 12.7369 2.93827 12.6979 2.88692C12.659 2.83558 12.6354 2.77422 12.63 2.71V1.68C12.6302 1.24297 12.4601 0.823057 12.1557 0.509395C11.8514 0.195732 11.4368 0.0130069 11 2.59345e-10H9.06C8.61351 -7.81621e-06 8.18516 0.176672 7.86851 0.491449C7.55186 0.806226 7.37264 1.23352 7.37 1.68V2.77C7.37 2.91 7.26 3.01 7.11 3.07C7.05491 3.10573 6.99066 3.12474 6.925 3.12474C6.85934 3.12474 6.79509 3.10573 6.74 3.07L6 2.26C5.68328 1.94517 5.25653 1.76586 4.81 1.76C4.58991 1.76043 4.37212 1.80489 4.16947 1.89076C3.96682 1.97663 3.7834 2.10217 3.63 2.26L2.26 3.6C2.09911 3.75571 1.97118 3.94219 1.88381 4.14834C1.79644 4.35449 1.75142 4.5761 1.75142 4.8C1.75142 5.0239 1.79644 5.24551 1.88381 5.45166C1.97118 5.65781 2.09911 5.84429 2.26 6L3 6.74C3.0392 6.80119 3.06004 6.87233 3.06004 6.945C3.06004 7.01767 3.0392 7.08881 3 7.15C2.97748 7.21038 2.93827 7.26313 2.88692 7.30208C2.83558 7.34103 2.77422 7.36458 2.71 7.37H1.68C1.23444 7.37 0.807122 7.547 0.492061 7.86206C0.177 8.17712 2.59346e-10 8.60444 2.59345e-10 9.05V10.94C-7.81621e-06 11.3865 0.176672 11.8148 0.491449 12.1315C0.806226 12.4481 1.23352 12.6274 1.68 12.63H2.77C2.91 12.63 3.01 12.74 3.07 12.89C3.10573 12.9451 3.12474 13.0093 3.12474 13.075C3.12474 13.1407 3.10573 13.2049 3.07 13.26L2.26 14C1.94517 14.3167 1.76586 14.7435 1.76 15.19C1.75966 15.4117 1.80372 15.6312 1.8896 15.8356C1.97547 16.04 2.10142 16.2251 2.26 16.38L3.6 17.74C3.75522 17.8963 3.93984 18.0204 4.14322 18.105C4.34659 18.1897 4.56471 18.2333 4.785 18.2333C5.00529 18.2333 5.22341 18.1897 5.42678 18.105C5.63016 18.0204 5.81478 17.8963 5.97 17.74L6.74 17C6.80119 16.9608 6.87233 16.94 6.945 16.94C7.01767 16.94 7.08881 16.9608 7.15 17C7.21038 17.0225 7.26313 17.0617 7.30208 17.1131C7.34103 17.1644 7.36458 17.2258 7.37 17.29V18.38C7.38555 18.8151 7.56939 19.2271 7.88278 19.5293C8.19617 19.8315 8.61464 20.0003 9.05 20H10.94C11.3865 20 11.8148 19.8233 12.1315 19.5086C12.4481 19.1938 12.6274 18.7665 12.63 18.32V17.23C12.63 17.09 12.74 16.99 12.89 16.93C12.9451 16.8943 13.0093 16.8753 13.075 16.8753C13.1407 16.8753 13.2049 16.8943 13.26 16.93L14.02 17.7C14.3367 18.0148 14.7635 18.1941 15.21 18.2C15.4301 18.1996 15.6479 18.1551 15.8505 18.0692C16.0532 17.9834 16.2366 17.8578 16.39 17.7L17.73 16.36C17.8863 16.2048 18.0104 16.0202 18.095 15.8168C18.1797 15.6134 18.2233 15.3953 18.2233 15.175C18.2233 14.9547 18.1797 14.7366 18.095 14.5332C18.0104 14.3298 17.8863 14.1452 17.73 13.99L17 13.26C16.9643 13.2049 16.9453 13.1407 16.9453 13.075C16.9453 13.0093 16.9643 12.9451 17 12.89C17.0225 12.8296 17.0617 12.7769 17.1131 12.7379C17.1644 12.699 17.2258 12.6754 17.29 12.67H18.38C18.8134 12.6545 19.2239 12.4721 19.5259 12.1608C19.8278 11.8496 19.9977 11.4336 20 11V9.06C20 8.61351 19.8233 8.18516 19.5086 7.86851C19.1938 7.55186 18.7665 7.37264 18.32 7.37V7.37ZM10 13.5C9.30777 13.5 8.63108 13.2947 8.0555 12.9101C7.47993 12.5256 7.03133 11.9789 6.76642 11.3394C6.50151 10.6999 6.4322 9.99612 6.56725 9.31718C6.7023 8.63825 7.03564 8.01461 7.52513 7.52513C8.01461 7.03564 8.63825 6.7023 9.31718 6.56725C9.99612 6.4322 10.6999 6.50151 11.3394 6.76642C11.9789 7.03133 12.5256 7.47993 12.9101 8.0555C13.2947 8.63108 13.5 9.30777 13.5 10C13.5 10.9283 13.1313 11.8185 12.4749 12.4749C11.8185 13.1313 10.9283 13.5 10 13.5V13.5Z" fill="white"/> </svg>
                    <p>Settings</p>
                </div>
            </a>

        </div>
        <div class="socials">
            <svg width="36" height="36" viewBox="0 0 36 36" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M30.9375 3.9375H5.0625C4.44023 3.9375 3.9375 4.44023 3.9375 5.0625V30.9375C3.9375 31.5598 4.44023 32.0625 5.0625 32.0625H30.9375C31.5598 32.0625 32.0625 31.5598 32.0625 30.9375V5.0625C32.0625 4.44023 31.5598 3.9375 30.9375 3.9375ZM27.6891 12.1465H25.4426C23.6813 12.1465 23.3402 12.9832 23.3402 14.2137V16.9242H27.5449L26.9965 21.1676H23.3402V32.0625H18.9563V21.1711H15.2895V16.9242H18.9563V13.7953C18.9563 10.1637 21.1746 8.18438 24.416 8.18438C25.9699 8.18438 27.3023 8.30039 27.6926 8.35313V12.1465H27.6891Z" fill="black"/> </svg>
            <svg width="36" height="36" viewBox="0 0 36 36" fill="none" xmlns="http://www.w3.org/2000/svg"> <path fill-rule="evenodd" clip-rule="evenodd" d="M1.5 4.257C1.5 3.5258 1.79047 2.82455 2.30751 2.30751C2.82454 1.79047 3.5258 1.5 4.257 1.5H31.74C32.1024 1.49941 32.4613 1.5703 32.7962 1.7086C33.1311 1.84691 33.4355 2.04992 33.6919 2.30601C33.9482 2.5621 34.1516 2.86624 34.2903 3.20102C34.4289 3.5358 34.5002 3.89464 34.5 4.257V31.74C34.5004 32.1024 34.4293 32.4614 34.2909 32.7963C34.1524 33.1313 33.9492 33.4356 33.693 33.692C33.4368 33.9483 33.1326 34.1516 32.7977 34.2903C32.4628 34.4289 32.1039 34.5002 31.7415 34.5H4.257C3.89482 34.5 3.53619 34.4286 3.2016 34.29C2.867 34.1513 2.56301 33.9481 2.30698 33.692C2.05095 33.4358 1.8479 33.1317 1.70943 32.797C1.57097 32.4624 1.4998 32.1037 1.5 31.7415V4.257ZM14.562 14.082H19.0305V16.326C19.6755 15.036 21.3255 13.875 23.805 13.875C28.5585 13.875 29.685 16.4445 29.685 21.159V29.892H24.8745V22.233C24.8745 19.548 24.2295 18.033 22.5915 18.033C20.319 18.033 19.374 19.6665 19.374 22.233V29.892H14.562V14.082ZM6.312 29.6865H11.124V13.875H6.312V29.685V29.6865ZM11.8125 8.718C11.8216 9.13001 11.7483 9.53968 11.5969 9.92298C11.4455 10.3063 11.219 10.6555 10.9308 10.9501C10.6427 11.2446 10.2985 11.4787 9.91868 11.6385C9.53882 11.7983 9.13086 11.8806 8.71875 11.8806C8.30664 11.8806 7.89868 11.7983 7.51882 11.6385C7.13895 11.4787 6.79483 11.2446 6.50665 10.9501C6.21847 10.6555 5.99204 10.3063 5.84064 9.92298C5.68924 9.53968 5.61593 9.13001 5.625 8.718C5.64281 7.90929 5.97658 7.13969 6.55483 6.57403C7.13308 6.00838 7.90984 5.69163 8.71875 5.69163C9.52766 5.69163 10.3044 6.00838 10.8827 6.57403C11.4609 7.13969 11.7947 7.90929 11.8125 8.718V8.718Z" fill="black"/> </svg>
            <svg width="36" height="36" viewBox="0 0 36 36" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M31.32 4.6485C30.2205 3.549 28.8975 3 27.3495 3H8.619C7.071 3 5.748 3.549 4.6485 4.6485C3.549 5.748 3 7.071 3 8.619V27.3495C3 28.8975 3.549 30.2205 4.6485 31.32C5.748 32.4195 7.071 32.9685 8.619 32.9685H12.99C13.275 32.9685 13.4895 32.958 13.6335 32.9385C13.801 32.9049 13.9523 32.8156 14.0625 32.685C14.205 32.535 14.277 32.3175 14.277 32.0325L14.2665 30.705C14.2605 29.859 14.2575 29.19 14.2575 28.695L13.8075 28.773C13.5225 28.8255 13.1625 28.848 12.726 28.842C12.271 28.8336 11.8175 28.788 11.37 28.7055C10.8936 28.6175 10.4451 28.417 10.062 28.1205C9.66074 27.8169 9.36146 27.3984 9.204 26.9205L9.009 26.4705C8.84464 26.1155 8.63816 25.7816 8.394 25.476C8.115 25.1115 7.8315 24.8655 7.545 24.735L7.41 24.6375C7.31587 24.5701 7.23024 24.4915 7.155 24.4035C7.08314 24.3218 7.02398 24.2298 6.9795 24.1305C6.9405 24.039 6.9735 23.964 7.077 23.9055C7.182 23.8455 7.3695 23.817 7.644 23.817L8.034 23.877C8.2935 23.928 8.616 24.084 8.9985 24.3435C9.38559 24.6074 9.70894 24.9543 9.945 25.359C10.245 25.8915 10.605 26.298 11.028 26.5785C11.451 26.8575 11.877 26.9985 12.306 26.9985C12.735 26.9985 13.1055 26.9655 13.419 26.901C13.7222 26.8383 14.0168 26.7396 14.2965 26.607C14.4135 25.737 14.7315 25.065 15.252 24.597C14.5776 24.5309 13.9091 24.4135 13.2525 24.246C12.6117 24.07 11.9954 23.8145 11.418 23.4855C10.8139 23.1566 10.2803 22.7122 9.8475 22.1775C9.432 21.657 9.09 20.9745 8.823 20.13C8.5575 19.284 8.424 18.3075 8.424 17.202C8.424 15.6285 8.937 14.289 9.9645 13.182C9.4845 12 9.5295 10.6725 10.101 9.204C10.479 9.0855 11.0385 9.174 11.7795 9.4665C12.5205 9.759 13.0635 10.0095 13.4085 10.2165C13.7535 10.4265 14.0295 10.602 14.238 10.7445C15.4575 10.4051 16.7177 10.2345 17.9835 10.2375C19.272 10.2375 20.52 10.407 21.7305 10.7445L22.4715 10.2765C23.0415 9.93428 23.6427 9.64699 24.267 9.4185C24.957 9.1575 25.482 9.087 25.848 9.204C26.433 10.674 26.484 12 26.0025 13.1835C27.03 14.289 27.5445 15.6285 27.5445 17.2035C27.5445 18.309 27.411 19.2885 27.144 20.139C26.8785 20.991 26.5335 21.6735 26.1105 22.188C25.6701 22.7158 25.1343 23.156 24.531 23.4855C23.901 23.8365 23.289 24.09 22.6965 24.246C22.0399 24.4141 21.3715 24.5319 20.697 24.5985C21.372 25.1835 21.711 26.106 21.711 27.3675V32.0325C21.711 32.253 21.7425 32.4315 21.8085 32.568C21.8388 32.6338 21.8821 32.6928 21.9357 32.7415C21.9893 32.7902 22.0521 32.8276 22.1205 32.8515C22.2645 32.9025 22.3905 32.9355 22.5015 32.9475C22.6125 32.9625 22.7715 32.967 22.9785 32.967H27.3495C28.8975 32.967 30.2205 32.418 31.32 31.3185C32.418 30.2205 32.9685 28.896 32.9685 27.348V8.619C32.9685 7.071 32.418 5.748 31.3185 4.6485H31.32Z" fill="black"/> </svg>
            <svg width="36" height="36" viewBox="0 0 36 36" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M30.9375 3.9375H5.0625C4.44023 3.9375 3.9375 4.44023 3.9375 5.0625V30.9375C3.9375 31.5598 4.44023 32.0625 5.0625 32.0625H30.9375C31.5598 32.0625 32.0625 31.5598 32.0625 30.9375V5.0625C32.0625 4.44023 31.5598 3.9375 30.9375 3.9375ZM25.5691 14.1223C25.5797 14.2875 25.5797 14.4598 25.5797 14.6285C25.5797 19.7895 21.6492 25.7344 14.4668 25.7344C12.252 25.7344 10.1988 25.091 8.46914 23.9836C8.78555 24.0188 9.08789 24.0328 9.41133 24.0328C11.2395 24.0328 12.9199 23.4141 14.2594 22.3664C12.5438 22.3313 11.1023 21.2063 10.6102 19.6594C11.2113 19.7473 11.7527 19.7473 12.3715 19.5891C11.4881 19.4096 10.6941 18.9298 10.1244 18.2313C9.55462 17.5327 9.24429 16.6585 9.24609 15.757V15.7078C9.76289 15.9996 10.3711 16.1789 11.0074 16.2035C10.4725 15.847 10.0338 15.364 9.73023 14.7974C9.42667 14.2307 9.26762 13.5979 9.26719 12.9551C9.26719 12.2273 9.45703 11.5629 9.79805 10.9863C10.7786 12.1934 12.0021 13.1806 13.3891 13.8838C14.7762 14.587 16.2957 14.9905 17.8488 15.068C17.2969 12.4137 19.2797 10.2656 21.6633 10.2656C22.7883 10.2656 23.8008 10.7367 24.5145 11.4961C25.3969 11.3309 26.2406 11.0004 26.993 10.5574C26.7012 11.4609 26.0895 12.2238 25.2773 12.7055C26.0648 12.6211 26.8242 12.4031 27.5273 12.0973C26.9965 12.8777 26.332 13.5703 25.5691 14.1223V14.1223Z" fill="black"/> </svg>

        </div>
    </div>
    <div class="addFeedComponent">
        <h2>Add new feed</h2>
        <form method="get" action="add_feed">
        <textarea type="text" name="feedDescription" class="feedDescription" placeholder="Start typing your feed here"></textarea>
        
        <div class="resourceOptions">
			
			
            <label class="addMedia" for="imageInput">
                <svg width="21" height="21" viewBox="0 0 21 21" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M11 19H1.6C1.44087 19 1.28826 18.9368 1.17574 18.8243C1.06321 18.7117 1 18.5591 1 18.4V1.6C1 1.44087 1.06321 1.28826 1.17574 1.17574C1.28826 1.06321 1.44087 1 1.6 1H18.4C18.5591 1 18.7117 1.06321 18.8243 1.17574C18.9368 1.28826 19 1.44087 19 1.6V11" stroke="#005DBB" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/> <path d="M1 14L8 11L13.5 13.5" stroke="#005DBB" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/> <path d="M14 8C13.4696 8 12.9609 7.78929 12.5858 7.41421C12.2107 7.03914 12 6.53043 12 6C12 5.46957 12.2107 4.96086 12.5858 4.58579C12.9609 4.21071 13.4696 4 14 4C14.5304 4 15.0391 4.21071 15.4142 4.58579C15.7893 4.96086 16 5.46957 16 6C16 6.53043 15.7893 7.03914 15.4142 7.41421C15.0391 7.78929 14.5304 8 14 8V8Z" stroke="#005DBB" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/> <path d="M17 17V20M14 17H17H14ZM20 17H17H20ZM17 17V14V17Z" stroke="#005DBB" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/> </svg>
                <p>Upload an image</p>
            </label>
            <input type="file" id="imageInput" style="visibility: hidden;width: 0px;" accept=".jpeg,.jpg,.png,.webp">
            <label class="addMedia" for="videoInput">
                <svg width="21" height="21" viewBox="0 0 21 21" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M11 19H1.6C1.44087 19 1.28826 18.9368 1.17574 18.8243C1.06321 18.7117 1 18.5591 1 18.4V1.6C1 1.44087 1.06321 1.28826 1.17574 1.17574C1.28826 1.06321 1.44087 1 1.6 1H18.4C18.5591 1 18.7117 1.06321 18.8243 1.17574C18.9368 1.28826 19 1.44087 19 1.6V11" stroke="#005DBB" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/> <path d="M17 17V20M14 17H17H14ZM20 17H17H20ZM17 17V14V17Z" stroke="#005DBB" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/> <path d="M7.898 6.51307C7.80681 6.46089 7.70352 6.43357 7.59846 6.43384C7.4934 6.43411 7.39025 6.46196 7.29933 6.51461C7.20841 6.56726 7.13291 6.64285 7.08038 6.73384C7.02785 6.82483 7.00013 6.92801 7 7.03307V12.9661C6.99996 13.0712 7.02755 13.1745 7.08001 13.2657C7.13247 13.3568 7.20795 13.4325 7.2989 13.4853C7.38985 13.5381 7.49307 13.566 7.59821 13.5663C7.70336 13.5666 7.80674 13.5393 7.898 13.4871L13.088 10.5211C13.1799 10.4686 13.2562 10.3928 13.3093 10.3013C13.3624 10.2098 13.3904 10.1059 13.3904 10.0001C13.3904 9.89428 13.3624 9.79037 13.3093 9.69887C13.2562 9.60737 13.1799 9.53155 13.088 9.47907L7.898 6.51307V6.51307Z" stroke="#005DBB" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"/> </svg>
                <p>Upload a video</p>
            </label>
            <input type="file" id="videoInput" style="visibility: hidden;width: 0px;" accept=".mp4,.mov,.mpeg">
        </div>
        <!-- <input name="userID" type="text" class="tempImageURLLoader" placeholder="enter user id"/> -->
        <input name="mediaURL" type="text" class="tempImageURLLoader" placeholder="enter image url"/>
        <div class="mediaPreview">
            <h3>Preview</h3>
            <div class="mediawrap">
                <img src="../media/general resource/landscape3.png"></img>
            </div>
        </div>
        <div class="PostFeedButton">
            <button type="submit">Post</button>
        </div>
        </form>
    </div>
</body>
</html>