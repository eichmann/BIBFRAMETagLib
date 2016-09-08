package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionPrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionPrecedesInNarrativeIterator theCollectionPrecedesInNarrativeIterator = (CollectionPrecedesInNarrativeIterator)findAncestorWithClass(this, CollectionPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theCollectionPrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

