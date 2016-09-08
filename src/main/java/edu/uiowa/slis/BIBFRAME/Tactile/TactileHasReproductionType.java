package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasReproductionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasReproductionType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasReproductionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasReproductionIterator theTactileHasReproductionIterator = (TactileHasReproductionIterator)findAncestorWithClass(this, TactileHasReproductionIterator.class);
			pageContext.getOut().print(theTactileHasReproductionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasReproduction tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasReproduction tag ");
		}
		return SKIP_BODY;
	}
}

