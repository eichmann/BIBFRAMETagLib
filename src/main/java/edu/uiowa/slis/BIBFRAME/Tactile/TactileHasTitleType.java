package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasTitleIterator theTactileHasTitleIterator = (TactileHasTitleIterator)findAncestorWithClass(this, TactileHasTitleIterator.class);
			pageContext.getOut().print(theTactileHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

