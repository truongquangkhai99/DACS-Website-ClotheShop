<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>Thanh toán</title>
<style type="text/css">
.order-md-2 {
	-ms-flex-order: 2;
	order: 2
}

.mb-0, .my-0 {
	margin-bottom: 0 !important
}

.mb-3, .my-3 {
	margin-bottom: 1rem !important
}

.mb-4, .my-4 {
	margin-bottom: 1.5rem !important
}

.d-flex {
	display: -ms-flexbox !important;
	display: flex !important
}

.justify-content-between {
	-ms-flex-pack: justify !important;
	justify-content: space-between !important
}

.align-items-center {
	-ms-flex-align: center !important;
	align-items: center !important
}

.text-muted {
	color: #6c757d !important
}

.badge {
	display: inline-block;
	padding: .25em .4em;
	font-weight: 700;
	line-height: 1;
	text-align: center;
	white-space: nowrap;
	vertical-align: baseline;
	border-radius: .25rem;
	transition: color .15s ease-in-out, background-color .15s ease-in-out,
		border-color .15s ease-in-out, box-shadow .15s ease-in-out
}

@media ( prefers-reduced-motion :reduce) {
	.badge {
		transition: none
	}
}

a.badge:focus, a.badge:hover {
	text-decoration: none
}

.badge:empty {
	display: none
}

.btn .badge {
	position: relative;
	top: -1px
}

.badge-pill {
	padding-right: .6em;
	padding-left: .6em;
	border-radius: 10rem
}

.badge-primary {
	color: #fff;
	background-color: #007bff
}

a.badge-primary:focus, a.badge-primary:hover {
	color: #fff;
	background-color: #0062cc
}

a.badge-primary.focus, a.badge-primary:focus {
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(0, 123, 255, .5)
}

.badge-secondary {
	color: #fff;
	background-color: #6c757d
}

a.badge-secondary:focus, a.badge-secondary:hover {
	color: #fff;
	background-color: #545b62
}

a.badge-secondary.focus, a.badge-secondary:focus {
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(108, 117, 125, .5)
}

.badge-success {
	color: #fff;
	background-color: #28a745
}

a.badge-success:focus, a.badge-success:hover {
	color: #fff;
	background-color: #1e7e34
}

a.badge-success.focus, a.badge-success:focus {
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(40, 167, 69, .5)
}

.badge-info {
	color: #fff;
	background-color: #17a2b8
}

a.badge-info:focus, a.badge-info:hover {
	color: #fff;
	background-color: #117a8b
}

a.badge-info.focus, a.badge-info:focus {
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(23, 162, 184, .5)
}

.badge-warning {
	color: #212529;
	background-color: #ffc107
}

a.badge-warning:focus, a.badge-warning:hover {
	color: #212529;
	background-color: #d39e00
}

a.badge-warning.focus, a.badge-warning:focus {
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(255, 193, 7, .5)
}

.badge-danger {
	color: #fff;
	background-color: #dc3545
}

a.badge-danger:focus, a.badge-danger:hover {
	color: #fff;
	background-color: #bd2130
}

a.badge-danger.focus, a.badge-danger:focus {
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(220, 53, 69, .5)
}

.badge-light {
	color: #212529;
	background-color: #f8f9fa
}

a.badge-light:focus, a.badge-light:hover {
	color: #212529;
	background-color: #dae0e5
}

a.badge-light.focus, a.badge-light:focus {
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(248, 249, 250, .5)
}

.badge-dark {
	color: #fff;
	background-color: #343a40
}

a.badge-dark:focus, a.badge-dark:hover {
	color: #fff;
	background-color: #1d2124
}

a.badge-dark.focus, a.badge-dark:focus {
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(52, 58, 64, .5)
}

.badge {
	border: 1px solid #000
}

.list-group {
	display: -ms-flexbox;
	display: flex;
	-ms-flex-direction: column;
	flex-direction: column;
	padding-left: 0;
	margin-bottom: 0
}

.list-group-item-action {
	width: 100%;
	color: #495057;
	text-align: inherit
}

.list-group-item-action:focus, .list-group-item-action:hover {
	z-index: 1;
	color: #495057;
	text-decoration: none;
	background-color: #f8f9fa
}

.list-group-item-action:active {
	color: #212529;
	background-color: #e9ecef
}

.list-group-item {
	position: relative;
	display: block;
	padding: .75rem 1.25rem;
	margin-bottom: -1px;
	background-color: #fff;
	border: 1px solid rgba(0, 0, 0, .125)
}

.list-group-item:first-child {
	border-top-left-radius: .25rem;
	border-top-right-radius: .25rem
}

.list-group-item:last-child {
	margin-bottom: 0;
	border-bottom-right-radius: .25rem;
	border-bottom-left-radius: .25rem
}

.list-group-item.disabled, .list-group-item:disabled {
	color: #6c757d;
	pointer-events: none;
	background-color: #fff
}

.list-group-item.active {
	z-index: 2;
	color: #fff;
	background-color: #007bff;
	border-color: #007bff
}

.list-group-horizontal {
	-ms-flex-direction: row;
	flex-direction: row
}

.list-group-horizontal .list-group-item {
	margin-right: -1px;
	margin-bottom: 0
}

.list-group-horizontal .list-group-item:first-child {
	border-top-left-radius: .25rem;
	border-bottom-left-radius: .25rem;
	border-top-right-radius: 0
}

.list-group-horizontal .list-group-item:last-child {
	margin-right: 0;
	border-top-right-radius: .25rem;
	border-bottom-right-radius: .25rem;
	border-bottom-left-radius: 0
}

@media ( min-width :576px) {
	.list-group-horizontal-sm {
		-ms-flex-direction: row;
		flex-direction: row
	}
	.list-group-horizontal-sm .list-group-item {
		margin-right: -1px;
		margin-bottom: 0
	}
	.list-group-horizontal-sm .list-group-item:first-child {
		border-top-left-radius: .25rem;
		border-bottom-left-radius: .25rem;
		border-top-right-radius: 0
	}
	.list-group-horizontal-sm .list-group-item:last-child {
		margin-right: 0;
		border-top-right-radius: .25rem;
		border-bottom-right-radius: .25rem;
		border-bottom-left-radius: 0
	}
}

@media ( min-width :768px) {
	.list-group-horizontal-md {
		-ms-flex-direction: row;
		flex-direction: row
	}
	.list-group-horizontal-md .list-group-item {
		margin-right: -1px;
		margin-bottom: 0
	}
	.list-group-horizontal-md .list-group-item:first-child {
		border-top-left-radius: .25rem;
		border-bottom-left-radius: .25rem;
		border-top-right-radius: 0
	}
	.list-group-horizontal-md .list-group-item:last-child {
		margin-right: 0;
		border-top-right-radius: .25rem;
		border-bottom-right-radius: .25rem;
		border-bottom-left-radius: 0
	}
}

@media ( min-width :992px) {
	.list-group-horizontal-lg {
		-ms-flex-direction: row;
		flex-direction: row
	}
	.list-group-horizontal-lg .list-group-item {
		margin-right: -1px;
		margin-bottom: 0
	}
	.list-group-horizontal-lg .list-group-item:first-child {
		border-top-left-radius: .25rem;
		border-bottom-left-radius: .25rem;
		border-top-right-radius: 0
	}
	.list-group-horizontal-lg .list-group-item:last-child {
		margin-right: 0;
		border-top-right-radius: .25rem;
		border-bottom-right-radius: .25rem;
		border-bottom-left-radius: 0
	}
}

@media ( min-width :1200px) {
	.list-group-horizontal-xl {
		-ms-flex-direction: row;
		flex-direction: row
	}
	.list-group-horizontal-xl .list-group-item {
		margin-right: -1px;
		margin-bottom: 0
	}
	.list-group-horizontal-xl .list-group-item:first-child {
		border-top-left-radius: .25rem;
		border-bottom-left-radius: .25rem;
		border-top-right-radius: 0
	}
	.list-group-horizontal-xl .list-group-item:last-child {
		margin-right: 0;
		border-top-right-radius: .25rem;
		border-bottom-right-radius: .25rem;
		border-bottom-left-radius: 0
	}
}

.list-group-flush .list-group-item {
	border-right: 0;
	border-left: 0;
	border-radius: 0
}

.list-group-flush .list-group-item:last-child {
	margin-bottom: -1px
}

.list-group-flush:first-child .list-group-item:first-child {
	border-top: 0
}

.list-group-flush:last-child .list-group-item:last-child {
	margin-bottom: 0;
	border-bottom: 0
}

.list-group-item-primary {
	color: #004085;
	background-color: #b8daff
}

.list-group-item-primary.list-group-item-action:focus,
	.list-group-item-primary.list-group-item-action:hover {
	color: #004085;
	background-color: #9fcdff
}

.list-group-item-primary.list-group-item-action.active {
	color: #fff;
	background-color: #004085;
	border-color: #004085
}

.list-group-item-secondary {
	color: #383d41;
	background-color: #d6d8db
}

.list-group-item-secondary.list-group-item-action:focus,
	.list-group-item-secondary.list-group-item-action:hover {
	color: #383d41;
	background-color: #c8cbcf
}

.list-group-item-secondary.list-group-item-action.active {
	color: #fff;
	background-color: #383d41;
	border-color: #383d41
}

.list-group-item-success {
	color: #155724;
	background-color: #c3e6cb
}

.list-group-item-success.list-group-item-action:focus,
	.list-group-item-success.list-group-item-action:hover {
	color: #155724;
	background-color: #b1dfbb
}

.list-group-item-success.list-group-item-action.active {
	color: #fff;
	background-color: #155724;
	border-color: #155724
}

.list-group-item-info {
	color: #0c5460;
	background-color: #bee5eb
}

.list-group-item-info.list-group-item-action:focus,
	.list-group-item-info.list-group-item-action:hover {
	color: #0c5460;
	background-color: #abdde5
}

.list-group-item-info.list-group-item-action.active {
	color: #fff;
	background-color: #0c5460;
	border-color: #0c5460
}

.list-group-item-warning {
	color: #856404;
	background-color: #ffeeba
}

.list-group-item-warning.list-group-item-action:focus,
	.list-group-item-warning.list-group-item-action:hover {
	color: #856404;
	background-color: #ffe8a1
}

.list-group-item-warning.list-group-item-action.active {
	color: #fff;
	background-color: #856404;
	border-color: #856404
}

.list-group-item-danger {
	color: #721c24;
	background-color: #f5c6cb
}

.list-group-item-danger.list-group-item-action:focus,
	.list-group-item-danger.list-group-item-action:hover {
	color: #721c24;
	background-color: #f1b0b7
}

.list-group-item-danger.list-group-item-action.active {
	color: #fff;
	background-color: #721c24;
	border-color: #721c24
}

.list-group-item-light {
	color: #818182;
	background-color: #fdfdfe
}

.list-group-item-light.list-group-item-action:focus,
	.list-group-item-light.list-group-item-action:hover {
	color: #818182;
	background-color: #ececf6
}

.list-group-item-light.list-group-item-action.active {
	color: #fff;
	background-color: #818182;
	border-color: #818182
}

.list-group-item-dark {
	color: #1b1e21;
	background-color: #c6c8ca
}

.list-group-item-dark.list-group-item-action:focus,
	.list-group-item-dark.list-group-item-action:hover {
	color: #1b1e21;
	background-color: #b9bbbe
}

.list-group-item-dark.list-group-item-action.active {
	color: #fff;
	background-color: #1b1e21;
	border-color: #1b1e21
}

.bg-light {
	background-color: #f8f9fa !important
}

a.bg-light:focus, a.bg-light:hover, button.bg-light:focus, button.bg-light:hover
	{
	background-color: #dae0e5 !important
}

.text-success {
	color: #28a745 !important
}

a.text-success:focus, a.text-success:hover {
	color: #19692c !important
}

.card {
	position: relative;
	display: -ms-flexbox;
	display: flex;
	-ms-flex-direction: column;
	flex-direction: column;
	min-width: 0;
	word-wrap: break-word;
	background-color: #fff;
	background-clip: border-box;
	border: 1px solid rgba(0, 0, 0, .125);
	border-radius: .25rem
}

.card>hr {
	margin-right: 0;
	margin-left: 0
}

.card>.list-group:first-child .list-group-item:first-child {
	border-top-left-radius: .25rem;
	border-top-right-radius: .25rem
}

.card>.list-group:last-child .list-group-item:last-child {
	border-bottom-right-radius: .25rem;
	border-bottom-left-radius: .25rem
}

.card-body {
	-ms-flex: 1 1 auto;
	flex: 1 1 auto;
	padding: 1.25rem
}

.card-title {
	margin-bottom: .75rem
}

.card-subtitle {
	margin-top: -.375rem;
	margin-bottom: 0
}

.card-text:last-child {
	margin-bottom: 0
}

.card-link:hover {
	text-decoration: none
}

.card-link+.card-link {
	margin-left: 1.25rem
}

.card-header {
	padding: .75rem 1.25rem;
	margin-bottom: 0;
	background-color: rgba(0, 0, 0, .03);
	border-bottom: 1px solid rgba(0, 0, 0, .125)
}

.card-header:first-child {
	border-radius: calc(.25rem - 1px) calc(.25rem - 1px) 0 0
}

.card-header+.list-group .list-group-item:first-child {
	border-top: 0
}

.card-footer {
	padding: .75rem 1.25rem;
	background-color: rgba(0, 0, 0, .03);
	border-top: 1px solid rgba(0, 0, 0, .125)
}

.card-footer:last-child {
	border-radius: 0 0 calc(.25rem - 1px) calc(.25rem - 1px)
}

.card-header-tabs {
	margin-right: -.625rem;
	margin-bottom: -.75rem;
	margin-left: -.625rem;
	border-bottom: 0
}

.card-header-pills {
	margin-right: -.625rem;
	margin-left: -.625rem
}

.card-img-overlay {
	position: absolute;
	top: 0;
	right: 0;
	bottom: 0;
	left: 0;
	padding: 1.25rem
}

.card-img {
	width: 100%;
	border-radius: calc(.25rem - 1px)
}

.card-img-top {
	width: 100%;
	border-top-left-radius: calc(.25rem - 1px);
	border-top-right-radius: calc(.25rem - 1px)
}

.card-img-bottom {
	width: 100%;
	border-bottom-right-radius: calc(.25rem - 1px);
	border-bottom-left-radius: calc(.25rem - 1px)
}

.card-deck {
	display: -ms-flexbox;
	display: flex;
	-ms-flex-direction: column;
	flex-direction: column
}

.card-deck .card {
	margin-bottom: 15px
}

@media ( min-width :576px) {
	.card-deck {
		-ms-flex-flow: row wrap;
		flex-flow: row wrap;
		margin-right: -15px;
		margin-left: -15px
	}
	.card-deck .card {
		display: -ms-flexbox;
		display: flex;
		-ms-flex: 1 0 0%;
		flex: 1 0 0%;
		-ms-flex-direction: column;
		flex-direction: column;
		margin-right: 15px;
		margin-bottom: 0;
		margin-left: 15px
	}
}

.card-group {
	display: -ms-flexbox;
	display: flex;
	-ms-flex-direction: column;
	flex-direction: column
}

.card-group>.card {
	margin-bottom: 15px
}

@media ( min-width :576px) {
	.card-group {
		-ms-flex-flow: row wrap;
		flex-flow: row wrap
	}
	.card-group>.card {
		-ms-flex: 1 0 0%;
		flex: 1 0 0%;
		margin-bottom: 0
	}
	.card-group>.card+.card {
		margin-left: 0;
		border-left: 0
	}
	.card-group>.card:not(:last-child) {
		border-top-right-radius: 0;
		border-bottom-right-radius: 0
	}
	.card-group>.card:not(:last-child) .card-header, .card-group>.card:not(:last-child) .card-img-top
		{
		border-top-right-radius: 0
	}
	.card-group>.card:not(:last-child) .card-footer, .card-group>.card:not(:last-child) .card-img-bottom
		{
		border-bottom-right-radius: 0
	}
	.card-group>.card:not(:first-child) {
		border-top-left-radius: 0;
		border-bottom-left-radius: 0
	}
	.card-group>.card:not(:first-child) .card-header, .card-group>.card:not(:first-child) .card-img-top
		{
		border-top-left-radius: 0
	}
	.card-group>.card:not(:first-child) .card-footer, .card-group>.card:not(:first-child) .card-img-bottom
		{
		border-bottom-left-radius: 0
	}
}

.card-columns .card {
	margin-bottom: .75rem
}

@media ( min-width :576px) {
	.card-columns {
		-webkit-column-count: 3;
		-moz-column-count: 3;
		column-count: 3;
		-webkit-column-gap: 1.25rem;
		-moz-column-gap: 1.25rem;
		column-gap: 1.25rem;
		orphans: 1;
		widows: 1
	}
	.card-columns .card {
		display: inline-block;
		width: 100%
	}
}

.accordion>.card {
	overflow: hidden
}

.accordion>.card:not(:first-of-type) .card-header:first-child {
	border-radius: 0
}

.accordion>.card:not(:first-of-type):not(:last-of-type) {
	border-bottom: 0;
	border-radius: 0
}

.accordion>.card:first-of-type {
	border-bottom: 0;
	border-bottom-right-radius: 0;
	border-bottom-left-radius: 0
}

.accordion>.card:last-of-type {
	border-top-left-radius: 0;
	border-top-right-radius: 0
}

.accordion>.card .card-header {
	margin-bottom: -1px
}

.p-2 {
	padding: .5rem !important
}

.input-group {
	position: relative;
	display: -ms-flexbox;
	display: flex;
	-ms-flex-wrap: wrap;
	flex-wrap: wrap;
	-ms-flex-align: stretch;
	align-items: stretch;
	width: 100%
}

.input-group>.custom-file, .input-group>.custom-select, .input-group>.form-control,
	.input-group>.form-control-plaintext {
	position: relative;
	-ms-flex: 1 1 auto;
	flex: 1 1 auto;
	width: 1%;
	margin-bottom: 0
}

.input-group>.custom-file+.custom-file, .input-group>.custom-file+.custom-select,
	.input-group>.custom-file+.form-control, .input-group>.custom-select+.custom-file,
	.input-group>.custom-select+.custom-select, .input-group>.custom-select+.form-control,
	.input-group>.form-control+.custom-file, .input-group>.form-control+.custom-select,
	.input-group>.form-control+.form-control, .input-group>.form-control-plaintext+.custom-file,
	.input-group>.form-control-plaintext+.custom-select, .input-group>.form-control-plaintext+.form-control
	{
	margin-left: -1px
}

.input-group>.custom-file .custom-file-input:focus ~.custom-file-label,
	.input-group>.custom-select:focus, .input-group>.form-control:focus {
	z-index: 3
}

.input-group>.custom-file .custom-file-input:focus {
	z-index: 4
}

.input-group>.custom-select:not(:last-child), .input-group>.form-control:not(:last-child)
	{
	border-top-right-radius: 0;
	border-bottom-right-radius: 0
}

.input-group>.custom-select:not(:first-child), .input-group>.form-control:not(:first-child)
	{
	border-top-left-radius: 0;
	border-bottom-left-radius: 0
}

.input-group>.custom-file {
	display: -ms-flexbox;
	display: flex;
	-ms-flex-align: center;
	align-items: center
}

.input-group>.custom-file:not(:last-child) .custom-file-label,
	.input-group>.custom-file:not(:last-child) .custom-file-label::after {
	border-top-right-radius: 0;
	border-bottom-right-radius: 0
}

.input-group>.custom-file:not(:first-child) .custom-file-label {
	border-top-left-radius: 0;
	border-bottom-left-radius: 0
}

.input-group-append, .input-group-prepend {
	display: -ms-flexbox;
	display: flex
}

.input-group-append .btn, .input-group-prepend .btn {
	position: relative;
	z-index: 2
}

.input-group-append .btn:focus, .input-group-prepend .btn:focus {
	z-index: 3
}

.input-group-append .btn+.btn, .input-group-append .btn+.input-group-text,
	.input-group-append .input-group-text+.btn, .input-group-append .input-group-text+.input-group-text,
	.input-group-prepend .btn+.btn, .input-group-prepend .btn+.input-group-text,
	.input-group-prepend .input-group-text+.btn, .input-group-prepend .input-group-text+.input-group-text
	{
	margin-left: -1px
}

.input-group-prepend {
	margin-right: -1px
}

.input-group-append {
	margin-left: -1px
}

.input-group-text {
	display: -ms-flexbox;
	display: flex;
	-ms-flex-align: center;
	align-items: center;
	padding: .375rem .75rem;
	margin-bottom: 0;
	font-size: 1rem;
	font-weight: 400;
	line-height: 1.5;
	color: #495057;
	text-align: center;
	white-space: nowrap;
	background-color: #e9ecef;
	border: 1px solid #ced4da;
	border-radius: .25rem
}

.input-group-text input[type=checkbox], .input-group-text input[type=radio]
	{
	margin-top: 0
}

.input-group-lg>.custom-select, .input-group-lg>.form-control:not(textarea)
	{
	height: calc(1.5em + 1rem + 2px)
}

.input-group-lg>.custom-select, .input-group-lg>.form-control,
	.input-group-lg>.input-group-append>.btn, .input-group-lg>.input-group-append>.input-group-text,
	.input-group-lg>.input-group-prepend>.btn, .input-group-lg>.input-group-prepend>.input-group-text
	{
	padding: .5rem 1rem;
	font-size: 1.25rem;
	line-height: 1.5;
	border-radius: .3rem
}

.input-group-sm>.custom-select, .input-group-sm>.form-control:not(textarea)
	{
	height: calc(1.5em + .5rem + 2px)
}

.input-group-sm>.custom-select, .input-group-sm>.form-control,
	.input-group-sm>.input-group-append>.btn, .input-group-sm>.input-group-append>.input-group-text,
	.input-group-sm>.input-group-prepend>.btn, .input-group-sm>.input-group-prepend>.input-group-text
	{
	padding: .25rem .5rem;
	font-size: .875rem;
	line-height: 1.5;
	border-radius: .2rem
}

.input-group-lg>.custom-select, .input-group-sm>.custom-select {
	padding-right: 1.75rem
}

.input-group>.input-group-append:last-child>.btn:not(:last-child):not(.dropdown-toggle),
	.input-group>.input-group-append:last-child>.input-group-text:not(:last-child),
	.input-group>.input-group-append:not(:last-child)>.btn, .input-group>.input-group-append:not(:last-child)>.input-group-text,
	.input-group>.input-group-prepend>.btn, .input-group>.input-group-prepend>.input-group-text
	{
	border-top-right-radius: 0;
	border-bottom-right-radius: 0
}

.input-group>.input-group-append>.btn, .input-group>.input-group-append>.input-group-text,
	.input-group>.input-group-prepend:first-child>.btn:not(:first-child),
	.input-group>.input-group-prepend:first-child>.input-group-text:not(:first-child),
	.input-group>.input-group-prepend:not(:first-child)>.btn, .input-group>.input-group-prepend:not(:first-child)>.input-group-text
	{
	border-top-left-radius: 0;
	border-bottom-left-radius: 0
}

.form-control {
	display: block;
	width: 100%;
	height: calc(1.5em + .75rem + 2px);
	padding: .375rem .75rem;
	font-size: 1rem;
	font-weight: 400;
	line-height: 1.5;
	color: #495057;
	background-color: #fff;
	background-clip: padding-box;
	border: 1px solid #ced4da;
	border-radius: .25rem;
	transition: border-color .15s ease-in-out, box-shadow .15s ease-in-out
}

@media ( prefers-reduced-motion :reduce) {
	.form-control {
		transition: none
	}
}

.form-control::-ms-expand {
	background-color: transparent;
	border: 0
}

.form-control:focus {
	color: #495057;
	background-color: #fff;
	border-color: #80bdff;
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(0, 123, 255, .25)
}

.form-control::-webkit-input-placeholder {
	color: #6c757d;
	opacity: 1
}

.form-control::-moz-placeholder {
	color: #6c757d;
	opacity: 1
}

.form-control:-ms-input-placeholder {
	color: #6c757d;
	opacity: 1
}

.form-control::-ms-input-placeholder {
	color: #6c757d;
	opacity: 1
}

.form-control::placeholder {
	color: #6c757d;
	opacity: 1
}

.form-control:disabled, .form-control[readonly] {
	background-color: #e9ecef;
	opacity: 1
}

select.form-control:focus::-ms-value {
	color: #495057;
	background-color: #fff
}

.d-block {
	display: block !important
}

.form-inline .custom-control {
	-ms-flex-align: center;
	align-items: center;
	-ms-flex-pack: center;
	justify-content: center
}

.custom-control {
	position: relative;
	display: block;
	min-height: 1.5rem;
	padding-left: 1.5rem
}

.custom-select {
	display: inline-block;
	width: 100%;
	height: calc(1.5em + .75rem + 2px);
	padding: .375rem 1.75rem .375rem .75rem;
	font-size: 1rem;
	font-weight: 400;
	line-height: 1.5;
	color: #495057;
	vertical-align: middle;
	background:
		url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 4 5'%3e%3cpath fill='%23343a40' d='M2 0L0 2h4zm0 5L0 3h4z'/%3e%3c/svg%3e")
		no-repeat right .75rem center/8px 10px;
	background-color: #fff;
	border: 1px solid #ced4da;
	border-radius: .25rem;
	-webkit-appearance: none;
	-moz-appearance: none;
	appearance: none
}

.custom-select:focus {
	border-color: #80bdff;
	outline: 0;
	box-shadow: 0 0 0 .2rem rgba(0, 123, 255, .25)
}

.custom-select:focus::-ms-value {
	color: #495057;
	background-color: #fff
}

.custom-select[multiple], .custom-select[size]:not([size="1"]) {
	height: auto;
	padding-right: .75rem;
	background-image: none
}

.custom-select:disabled {
	color: #6c757d;
	background-color: #e9ecef
}

.custom-select::-ms-expand {
	display: none
}
</style>
</head>
<body class="bg-light">
	<div class="container"
		style="margin-top: 20px; margin-bottom: 20px; border-radius: 25px; border: 2px solid #f0e7e782;">
		<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
			<div class="col-md-4 order-md-2 mb-4">
				<h4 class="d-flex justify-content-between align-items-center mb-3">
					<span class="text-muted">Giỏ hàng của bạn</span> <span
						class="badge badge-secondary badge-pill"
						style="border-radius: .25rem;">${TongSLCart}</span>
				</h4>
				<ul class="list-group mb-3">
					<li
						class="list-group-item d-flex justify-content-between lh-condensed">
						<div>
							<h6 class="my-0">Tổng tiền:</h6>
						</div> <span class="text-muted"><fmt:formatNumber type="number"
								groupingUsed="true" value="${TongGiaCart}" /> đ</span>
					</li>
					<li class="list-group-item d-flex justify-content-between bg-light">
						<div class="text-success">
							<h6 class="my-0">Mã giảm giá</h6>
							<small>NONE</small>
						</div> <span class="text-success">- <fmt:formatNumber
								type="number" groupingUsed="true" value="0" /> đ
					</span>
					</li>
					<li class="list-group-item d-flex justify-content-between"><span>Thành
							tiền (VND)</span> <strong><fmt:formatNumber type="number"
								groupingUsed="true" value="${TongGiaCart}" /> đ</strong></li>
				</ul>

				<form class="card p-2">
					<div class="input-group">
						<input type="text" class="form-control"
							placeholder="Bạn có mã giảm giá?">
						<div class="input-group-append">
							<button type="submit" class="btn btn-secondary">Áp dụng</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-8 order-md-1">
				<h4 class="mb-3">Thông tin thanh toán</h4>

				<form:form action="check-out" method="POST" modelAttribute="bills"
					class="needs-validation" >

					<div class="mb-3">
						<label for="name">Họ tên</label>
						<form:input path="ho_ten" class="form-control" type="text" name="name"
							id="name" placeholder="" required="required" autocomplete="off" />
					</div>

					<div class="mb-3">
						<label for="phone">Số điện thoại</label>
						<div class="input-group">
							<div class="input-group-prepend">
								<span class="input-group-text">+84</span>
							</div>
							<form:input path="sdt" class="form-control" type="text" name="phone"
								id="phone" placeholder="" required="required" autocomplete="off" />						

						</div>
					</div>

					<div class="mb-3">
						<label for="email">Email</label> 
						<form:input path="email" class="form-control" type="email" name="email"
							id="email" placeholder="you@example.com" required="required" autocomplete="off" value="${LoginInfo.email}"/>
					</div>

					<div class="mb-3">
						<label>Ghi chú</label>
						<form:input path="ghi_chu" class="form-control" type="text" name="note"
							/>
					</div>

					<div class="mb-3">
						<label for="address">Địa chỉ</label> 
						<form:input path="noi_nhan" class="form-control" type="text" name="address"
							id="address" placeholder="" required="required" autocomplete="off" />

					</div>

					<div class="row">
						<div class="col-md-4 mb-3">
							<label for="country">TP/Tỉnh</label> <select
								class="custom-select d-block w-100" id="tp" required>
								<option value="">Chọn</option>
								<option>TP.Hồ Chí Minh</option>
							</select>
						</div>
						<div class="col-md-4 mb-3">
							<label for="state">Quận/Huyện</label> <select
								class="custom-select d-block w-100" id="quan" required>
								<option value="">Chọn</option>
								<option>Quận 12</option>
							</select>
						</div>
						<div class="col-md-4 mb-3">
							<label for="state">Phường/Xã</label> <select
								class="custom-select d-block w-100" id="phuong" required>
								<option value="">Chọn</option>
								<option>Thới An</option>
							</select>
						</div>
					</div>
					<hr class="mb-4">

					<h4 class="mb-3">Phương thức thanh toán</h4>

					<div class="d-block my-3">
						<div class="custom-control custom-radio">
							<input id="credit" name="paymentMethod" type="radio"
								class="custom-control-input" checked required> <label
								class="custom-control-label" for="credit">Thanh toán khi
								nhận hàng</label>
						</div>
						<div class="custom-control custom-radio">
							<input id="debit" name="paymentMethod" type="radio"
								class="custom-control-input" required> <label
								class="custom-control-label" for="debit">Paypal</label>
						</div>
						<div class="custom-control custom-radio">
							<input id="paypal" name="paymentMethod" type="radio"
								class="custom-control-input" required> <label
								class="custom-control-label" for="paypal">ZaloPay</label>
						</div>
					</div>
					<hr class="mb-4">
					<button class="btn btn-primary btn-lg btn-block" type="submit">Thanh
						toán</button>
				</form:form>


			</div>
		</div>
	</div>
	<!--Section: Block Content-->
	<content tag="script222"> <script type="text/javascript">
		
	</script></content>
</body>