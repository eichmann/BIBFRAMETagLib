package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingRelationInverseIterator theThingRelationInverseIterator = (ThingRelationInverseIterator)findAncestorWithClass(this, ThingRelationInverseIterator.class);
			pageContext.getOut().print(theThingRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for relation tag ");
		}
		return SKIP_BODY;
	}
}

