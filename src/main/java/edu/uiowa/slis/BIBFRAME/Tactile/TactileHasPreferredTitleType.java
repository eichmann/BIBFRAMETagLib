package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasPreferredTitleIterator theTactileHasPreferredTitleIterator = (TactileHasPreferredTitleIterator)findAncestorWithClass(this, TactileHasPreferredTitleIterator.class);
			pageContext.getOut().print(theTactileHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

