package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObject theThreeDimensionalObject = (ThreeDimensionalObject)findAncestorWithClass(this, ThreeDimensionalObject.class);
			if (!theThreeDimensionalObject.commitNeeded) {
				pageContext.getOut().print(theThreeDimensionalObject.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ThreeDimensionalObject theThreeDimensionalObject = (ThreeDimensionalObject)findAncestorWithClass(this, ThreeDimensionalObject.class);
			return theThreeDimensionalObject.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ThreeDimensionalObject for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ThreeDimensionalObject theThreeDimensionalObject = (ThreeDimensionalObject)findAncestorWithClass(this, ThreeDimensionalObject.class);
			theThreeDimensionalObject.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for subjectURI tag ");
		}
	}
}

