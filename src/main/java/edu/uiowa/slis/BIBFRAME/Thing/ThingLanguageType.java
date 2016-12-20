package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingLanguageIterator theThingLanguageIterator = (ThingLanguageIterator)findAncestorWithClass(this, ThingLanguageIterator.class);
			pageContext.getOut().print(theThingLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for language tag ");
		}
		return SKIP_BODY;
	}
}

