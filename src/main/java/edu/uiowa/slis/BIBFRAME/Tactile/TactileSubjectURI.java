package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Tactile theTactile = (Tactile)findAncestorWithClass(this, Tactile.class);
			if (!theTactile.commitNeeded) {
				pageContext.getOut().print(theTactile.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Tactile theTactile = (Tactile)findAncestorWithClass(this, Tactile.class);
			return theTactile.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Tactile for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Tactile theTactile = (Tactile)findAncestorWithClass(this, Tactile.class);
			theTactile.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for subjectURI tag ");
		}
	}
}

