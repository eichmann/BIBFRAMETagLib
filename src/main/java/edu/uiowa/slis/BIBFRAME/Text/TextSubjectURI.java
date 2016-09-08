package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Text theText = (Text)findAncestorWithClass(this, Text.class);
			if (!theText.commitNeeded) {
				pageContext.getOut().print(theText.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Text for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Text theText = (Text)findAncestorWithClass(this, Text.class);
			return theText.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Text for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Text theText = (Text)findAncestorWithClass(this, Text.class);
			theText.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Text for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for subjectURI tag ");
		}
	}
}

