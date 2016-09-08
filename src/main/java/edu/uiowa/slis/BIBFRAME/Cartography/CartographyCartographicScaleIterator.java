package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class CartographyCartographicScaleIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyCartographicScaleIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyCartographicScaleIterator.class);

	String subjectURI = null;
	String cartographicScale = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Cartography ancestorInstance = (Cartography) findAncestorWithClass(this, Cartography.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://bib.ld4l.org/ontology/cartographicScale> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				cartographicScale = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in CartographyIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CartographyIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				cartographicScale = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in CartographyIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CartographyIterator doAfterBody");
		}

		return SKIP_BODY;
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

	public void setCartographicScale(String cartographicScale) {
		this.cartographicScale = cartographicScale;
	}

	public String getCartographicScale() {
		return cartographicScale;
	}

}
