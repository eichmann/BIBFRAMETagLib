package edu.uiowa.slis.BIBFRAME.NamedIndividual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NamedIndividualSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NamedIndividualSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NamedIndividualSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NamedIndividual theNamedIndividual = (NamedIndividual)findAncestorWithClass(this, NamedIndividual.class);
			if (!theNamedIndividual.commitNeeded) {
				pageContext.getOut().print(theNamedIndividual.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NamedIndividual for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NamedIndividual for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NamedIndividual theNamedIndividual = (NamedIndividual)findAncestorWithClass(this, NamedIndividual.class);
			return theNamedIndividual.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NamedIndividual for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NamedIndividual for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NamedIndividual theNamedIndividual = (NamedIndividual)findAncestorWithClass(this, NamedIndividual.class);
			theNamedIndividual.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NamedIndividual for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NamedIndividual for subjectURI tag ");
		}
	}
}

