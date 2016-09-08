package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Cartography extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Cartography currentInstance = null;
	private static final Log log = LogFactory.getLog(Cartography.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String cartographicEasternmostLongitude = null;
	String cartographicWesternmostLongitude = null;
	String cartographicZone = null;
	String cartographicNorthernmostLatitude = null;
	String cartographicSouthernmostLatitude = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CartographyIterator theCartographyIterator = (CartographyIterator) findAncestorWithClass(this, CartographyIterator.class);

			if (theCartographyIterator != null) {
				subjectURI = theCartographyIterator.getSubjectURI();
				label = theCartographyIterator.getLabel();
			}

			if (theCartographyIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?cartographicEasternmostLongitude ?cartographicWesternmostLongitude ?cartographicZone ?cartographicNorthernmostLatitude ?cartographicSouthernmostLatitude where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicEasternmostLongitude> ?cartographicEasternmostLongitude } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicWesternmostLongitude> ?cartographicWesternmostLongitude } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicZone> ?cartographicZone } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicNorthernmostLatitude> ?cartographicNorthernmostLatitude } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicSouthernmostLatitude> ?cartographicSouthernmostLatitude } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					cartographicEasternmostLongitude = sol.get("?cartographicEasternmostLongitude") == null ? null : sol.get("?cartographicEasternmostLongitude").toString();
					cartographicWesternmostLongitude = sol.get("?cartographicWesternmostLongitude") == null ? null : sol.get("?cartographicWesternmostLongitude").toString();
					cartographicZone = sol.get("?cartographicZone") == null ? null : sol.get("?cartographicZone").toString();
					cartographicNorthernmostLatitude = sol.get("?cartographicNorthernmostLatitude") == null ? null : sol.get("?cartographicNorthernmostLatitude").toString();
					cartographicSouthernmostLatitude = sol.get("?cartographicSouthernmostLatitude") == null ? null : sol.get("?cartographicSouthernmostLatitude").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Cartography doStartTag", e);
			throw new JspTagException("Exception raised in Cartography doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Cartography doEndTag", e);
			throw new JspTagException("Exception raised in Cartography doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setCartographicEasternmostLongitude(String cartographicEasternmostLongitude) {
		this.cartographicEasternmostLongitude = cartographicEasternmostLongitude;
	}

	public String getCartographicEasternmostLongitude() {
		return cartographicEasternmostLongitude;
	}

	public void setCartographicWesternmostLongitude(String cartographicWesternmostLongitude) {
		this.cartographicWesternmostLongitude = cartographicWesternmostLongitude;
	}

	public String getCartographicWesternmostLongitude() {
		return cartographicWesternmostLongitude;
	}

	public void setCartographicZone(String cartographicZone) {
		this.cartographicZone = cartographicZone;
	}

	public String getCartographicZone() {
		return cartographicZone;
	}

	public void setCartographicNorthernmostLatitude(String cartographicNorthernmostLatitude) {
		this.cartographicNorthernmostLatitude = cartographicNorthernmostLatitude;
	}

	public String getCartographicNorthernmostLatitude() {
		return cartographicNorthernmostLatitude;
	}

	public void setCartographicSouthernmostLatitude(String cartographicSouthernmostLatitude) {
		this.cartographicSouthernmostLatitude = cartographicSouthernmostLatitude;
	}

	public String getCartographicSouthernmostLatitude() {
		return cartographicSouthernmostLatitude;
	}

}
