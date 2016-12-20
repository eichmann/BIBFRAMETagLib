package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingRelationIterator theThingRelationIterator = (ThingRelationIterator)findAncestorWithClass(this, ThingRelationIterator.class);
			pageContext.getOut().print(theThingRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for relation tag ");
		}
		return SKIP_BODY;
	}
}

