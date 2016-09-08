package edu.uiowa.slis.BIBFRAME.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptHasCirculationStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManuscriptHasCirculationStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptHasCirculationStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptHasCirculationStatusIterator theManuscriptHasCirculationStatusIterator = (ManuscriptHasCirculationStatusIterator)findAncestorWithClass(this, ManuscriptHasCirculationStatusIterator.class);
			pageContext.getOut().print(theManuscriptHasCirculationStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for hasCirculationStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for hasCirculationStatus tag ");
		}
		return SKIP_BODY;
	}
}

