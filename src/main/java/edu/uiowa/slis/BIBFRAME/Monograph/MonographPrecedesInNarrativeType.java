package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographPrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographPrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographPrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographPrecedesInNarrativeIterator theMonographPrecedesInNarrativeIterator = (MonographPrecedesInNarrativeIterator)findAncestorWithClass(this, MonographPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theMonographPrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

