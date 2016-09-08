package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactilePreferredCitation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactilePreferredCitation currentInstance = null;
	private static final Log log = LogFactory.getLog(TactilePreferredCitation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactilePreferredCitationIterator theTactile = (TactilePreferredCitationIterator)findAncestorWithClass(this, TactilePreferredCitationIterator.class);
			pageContext.getOut().print(theTactile.getPreferredCitation());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for preferredCitation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for preferredCitation tag ");
		}
		return SKIP_BODY;
	}
}

