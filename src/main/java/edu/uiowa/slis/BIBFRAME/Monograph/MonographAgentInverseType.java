package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographAgentInverseIterator theMonographAgentInverseIterator = (MonographAgentInverseIterator)findAncestorWithClass(this, MonographAgentInverseIterator.class);
			pageContext.getOut().print(theMonographAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for agent tag ");
		}
		return SKIP_BODY;
	}
}

