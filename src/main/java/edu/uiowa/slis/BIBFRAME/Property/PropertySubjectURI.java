package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PropertySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Property theProperty = (Property)findAncestorWithClass(this, Property.class);
			if (!theProperty.commitNeeded) {
				pageContext.getOut().print(theProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Property for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Property theProperty = (Property)findAncestorWithClass(this, Property.class);
			return theProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Property for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Property theProperty = (Property)findAncestorWithClass(this, Property.class);
			theProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Property for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Property for subjectURI tag ");
		}
	}
}

