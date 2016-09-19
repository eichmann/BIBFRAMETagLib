package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasPartIterator theTactileHasPartIterator = (TactileHasPartIterator)findAncestorWithClass(this, TactileHasPartIterator.class);
			pageContext.getOut().print(theTactileHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

