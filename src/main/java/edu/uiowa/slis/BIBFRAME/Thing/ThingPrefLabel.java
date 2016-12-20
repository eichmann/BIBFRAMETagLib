package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPrefLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingPrefLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPrefLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingPrefLabelIterator theThing = (ThingPrefLabelIterator)findAncestorWithClass(this, ThingPrefLabelIterator.class);
			pageContext.getOut().print(theThing.getPrefLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for prefLabel tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for prefLabel tag ");
		}
		return SKIP_BODY;
	}
}

