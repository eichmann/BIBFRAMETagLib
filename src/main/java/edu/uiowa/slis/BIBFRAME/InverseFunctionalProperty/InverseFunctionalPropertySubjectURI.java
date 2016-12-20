package edu.uiowa.slis.BIBFRAME.InverseFunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InverseFunctionalPropertySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InverseFunctionalPropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(InverseFunctionalPropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			InverseFunctionalProperty theInverseFunctionalProperty = (InverseFunctionalProperty)findAncestorWithClass(this, InverseFunctionalProperty.class);
			if (!theInverseFunctionalProperty.commitNeeded) {
				pageContext.getOut().print(theInverseFunctionalProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InverseFunctionalProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			InverseFunctionalProperty theInverseFunctionalProperty = (InverseFunctionalProperty)findAncestorWithClass(this, InverseFunctionalProperty.class);
			return theInverseFunctionalProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing InverseFunctionalProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			InverseFunctionalProperty theInverseFunctionalProperty = (InverseFunctionalProperty)findAncestorWithClass(this, InverseFunctionalProperty.class);
			theInverseFunctionalProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing InverseFunctionalProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for subjectURI tag ");
		}
	}
}

