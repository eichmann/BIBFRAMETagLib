package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasPreferredTitleIterator theTactileHasPreferredTitleIterator = (TactileHasPreferredTitleIterator)findAncestorWithClass(this, TactileHasPreferredTitleIterator.class);
			pageContext.getOut().print(theTactileHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

