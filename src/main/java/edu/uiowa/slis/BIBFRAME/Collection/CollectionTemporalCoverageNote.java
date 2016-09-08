package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionTemporalCoverageNoteIterator theCollection = (CollectionTemporalCoverageNoteIterator)findAncestorWithClass(this, CollectionTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theCollection.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

