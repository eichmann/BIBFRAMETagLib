package edu.uiowa.slis.BIBFRAME.Datatype;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypeSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatatypeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Datatype theDatatype = (Datatype)findAncestorWithClass(this, Datatype.class);
			if (!theDatatype.commitNeeded) {
				pageContext.getOut().print(theDatatype.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Datatype for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Datatype for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Datatype theDatatype = (Datatype)findAncestorWithClass(this, Datatype.class);
			return theDatatype.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Datatype for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Datatype for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Datatype theDatatype = (Datatype)findAncestorWithClass(this, Datatype.class);
			theDatatype.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Datatype for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Datatype for subjectURI tag ");
		}
	}
}

