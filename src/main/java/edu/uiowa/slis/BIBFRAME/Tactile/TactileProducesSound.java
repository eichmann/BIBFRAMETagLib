package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileProducesSound extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileProducesSound currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileProducesSound.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileProducesSoundIterator theTactile = (TactileProducesSoundIterator)findAncestorWithClass(this, TactileProducesSoundIterator.class);
			pageContext.getOut().print(theTactile.getProducesSound());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for producesSound tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for producesSound tag ");
		}
		return SKIP_BODY;
	}
}

