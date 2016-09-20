package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographPrecedesInNarrativeInverseIterator theMonographPrecedesInNarrativeInverseIterator = (MonographPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, MonographPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theMonographPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

