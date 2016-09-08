package edu.uiowa.slis.BIBFRAME.Ansi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AnsiSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AnsiSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AnsiSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Ansi theAnsi = (Ansi)findAncestorWithClass(this, Ansi.class);
			if (!theAnsi.commitNeeded) {
				pageContext.getOut().print(theAnsi.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Ansi for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ansi for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Ansi theAnsi = (Ansi)findAncestorWithClass(this, Ansi.class);
			return theAnsi.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Ansi for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ansi for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Ansi theAnsi = (Ansi)findAncestorWithClass(this, Ansi.class);
			theAnsi.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Ansi for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ansi for subjectURI tag ");
		}
	}
}

