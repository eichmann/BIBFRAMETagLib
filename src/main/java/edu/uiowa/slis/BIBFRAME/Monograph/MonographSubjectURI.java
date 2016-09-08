package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Monograph theMonograph = (Monograph)findAncestorWithClass(this, Monograph.class);
			if (!theMonograph.commitNeeded) {
				pageContext.getOut().print(theMonograph.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Monograph theMonograph = (Monograph)findAncestorWithClass(this, Monograph.class);
			return theMonograph.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Monograph for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Monograph theMonograph = (Monograph)findAncestorWithClass(this, Monograph.class);
			theMonograph.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for subjectURI tag ");
		}
	}
}

